package com.spring.aspect;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.koala.rhschedule.util.error.ErrorInfo;
import com.koala.rhschedule.util.exception.ServiceException;
import com.spring.constants.CommonConstants;

/**
 * 
 * Aspect class to log request and response
 *
 */
@Component
@Aspect
public class RequestResponseLog {

	private static final Logger resultLog = LoggerFactory.getLogger("reportsLogger");

	private final static List<String> sensitiveDataList = Arrays.asList("mail", "contact", "phone", "address");

	private static boolean hasSensitiveData(final String response) {

		boolean hasSensitiveInfo = false;
		if (response != null) {
			hasSensitiveInfo = sensitiveDataList.stream().anyMatch(str -> response.toLowerCase().contains(str));
		}

		return hasSensitiveInfo;
	}

	private class LoggerThread extends Thread {

		private Map<String, Object> requestMap;
		private Throwable error;
		private String result;
		private String userEmail;
		private String requestMethod;
		private String requestUrl;

		private LoggerThread(Map<String, Object> requestMap, Throwable error, String result, String userEmail,
				String requestMethod, String requestUrl) {
			this.requestMap = requestMap;
			this.error = error;
			if (hasSensitiveData(result) == false) {
				this.result = result;
			} else {
				this.result = "This message contains sensitive data, can't be displayed!";
			}
			this.requestMethod = requestMethod;
			this.userEmail = userEmail;
			this.requestUrl = requestUrl;
		}
		
		/**
	     * Generates random key
	     * 
	     * @return Integer
	     */
	    private Integer getRandomInteger() {

	        Integer randomToken = 0;
	        try {

	            // Create a secure random number generator using the "SHA1PRNG" algorithm
	            SecureRandom secureRandom = SecureRandom.getInstance(CommonConstants.RANDOM_NUMBER_GENERATOR_ALOG);
	            randomToken = secureRandom.nextInt(999);
	        } catch (NoSuchAlgorithmException e) {
	            resultLog.error("Invalid Algorithm used.", e);
	        }

	        return randomToken;

	    }

		@Override
		public void run() {

			synchronized (resultLog) {// synchronized method

				StringBuilder loggingStr = new StringBuilder();

				Long transactionId = new Date().getTime() * 1000 + (1000 + getRandomInteger());
				loggingStr.append("\n Request: \n");
				loggingStr.append(" TransactionId: " + transactionId).append("\n");
				loggingStr.append(" RequestUrl: ").append(requestUrl).append("\n");
				loggingStr.append(" Method: ").append(requestMethod).append("\n");
				loggingStr.append(" User: ").append(userEmail).append("\n");
				loggingStr.append(" Input: ").append(requestMap.toString()).append("\n");

				loggingStr.append("\n Response : \n");
				loggingStr.append(" TransactionId: " + transactionId).append("\n");

				if (null != error && error instanceof ServiceException) {
					ServiceException exp = (ServiceException) error;
					ErrorInfo errorInfo = exp.getErrorInfo();
					loggingStr.append(" Exception: ").append(errorInfo);
				} else if (null != error) {
					loggingStr.append(" Exception: ").append(error.getMessage()).append("Cause: ")
							.append(error.getCause());
				} else {
					loggingStr.append(" Result: ").append(result);
				}
				resultLog.info(loggingStr.toString());
				loggingStr = null;
			}
		}
	}

	/**
	 * controller point cut expression
	 */
	@Pointcut("execution(* com.spring.controller..*(..))")
	public void controllerPointCut() {
	}

	/**
	 * aspect expression to log api request-response after api returns output
	 * 
	 * @param jp
	 * @param result
	 */
	@AfterReturning(pointcut = "controllerPointCut()", returning = "result")
	public void afterReturnAdvice(JoinPoint jp, Object result) {

		String res = null;
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		// String userEmail = (String)
		// request.getAttribute(CommonConstants.USER_MAIL_ID);
		String userId = String.valueOf(request.getAttribute(CommonConstants.USER_ID));
		String requestMethod = request.getMethod();
		String requestUrl = request.getRequestURL().toString();

		Map<String, Object> requestMap = getRequestDetails(jp);
		if (result != null) {
			res = result.toString();
		}
		new LoggerThread(requestMap, null, res, userId, requestMethod, requestUrl).start();
	}

	/**
	 * aspect expression to log api request-response after api throws exception
	 * 
	 * @param jp
	 * @param error
	 */
	@AfterThrowing(pointcut = "controllerPointCut()", throwing = "error")
	public void afterThrowingAdvice(JoinPoint jp, Throwable error) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String userEmail = (String) request.getAttribute(CommonConstants.USER_MAIL_ID);
		String requestMethod = request.getMethod();
		String requestUrl = request.getRequestURL().toString();

		Map<String, Object> requestMap = getRequestDetails(jp);

		new LoggerThread(requestMap, error, null, userEmail, requestMethod, requestUrl).start();
	}

	/**
	 * method to get request parameters and values
	 * 
	 * @param jp
	 * @return Map<String, Object>
	 */
	private Map<String, Object> getRequestDetails(JoinPoint jp) {
		String[] paraNames = null;
		final Signature signature = jp.getStaticPart().getSignature();
		if (signature instanceof MethodSignature) {
			final MethodSignature ms = (MethodSignature) signature;
			paraNames = ms.getParameterNames();
		}

		Map<String, Object> requestMap = new HashMap<>();
		Object[] arguments = jp.getArgs();
		if (paraNames != null) {
			for (int i = 0; i < arguments.length; i++) {
				if (!StringUtils.isEmpty(paraNames[i])) {
					requestMap.put(paraNames[i], arguments[i]);
				}
			}
		}
		return requestMap;
	}
	
}
