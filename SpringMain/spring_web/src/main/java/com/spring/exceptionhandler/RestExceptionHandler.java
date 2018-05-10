package com.spring.exceptionhandler;

import org.hibernate.HibernateException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.koala.rhschedule.util.error.ErrorInfo;
import com.koala.rhschedule.util.exception.ServiceException;
import com.koala.rhschedule.util.exception.ThirdPartyException;
import com.spring.constants.CommonConstants;
import com.spring.utill.ErrorCodeHelper;

/**
 * Rest Exception Handler
 * 
 * 
 *
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	@Qualifier(CommonConstants.ERROR_CODE_HELPER)
	private ErrorCodeHelper errorCodeHelper;

	/**
	 * 
	 * Handles cases when required request parameters are missing
	 * 
	 * @param request
	 * @param ex
	 * @param headers
	 * @param status
	 * 
	 * @return
	 */
	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.setContentType(MediaType.APPLICATION_JSON);
		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		HttpStatus httpStatus = HttpStatus.OK;
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}

		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1020_ERROR_CODE,
				CommonConstants.E1020_ERROR_DESCRIPTION);
		return handleExceptionInternal(ex, errorInfo, headers, httpStatus, request);

	}

	/**
	 * Handles unsupported Media type error
	 * 
	 * @param request
	 * @param ex
	 * @param headers
	 * @param status
	 */
	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpStatus httpStatus = HttpStatus.OK;
		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}
		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1023_ERROR_CODE,
				CommonConstants.E1023_ERROR_DESCRIPTION);
		return handleExceptionInternal(ex, errorInfo, headers, httpStatus, request);
	}

	/**
	 * 
	 * Handles cases when invalid input parameter is passed like when input json
	 * format is incorrect
	 * 
	 * @param request
	 * @param ex
	 * @param headers
	 * @param status
	 * 
	 * @return
	 */
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.setContentType(MediaType.APPLICATION_JSON);
		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		HttpStatus httpStatus = HttpStatus.OK;
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}

		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1019_ERROR_CODE,
				CommonConstants.E1019_ERROR_DESCRIPTION);
		return handleExceptionInternal(ex, errorInfo, headers, httpStatus, request);
	}

	/**
	 * Handles custom Service Exception thrown
	 * 
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler({ ServiceException.class })
	protected ResponseEntity<Object> handleServiceException(RuntimeException e, WebRequest request) {
		ServiceException exception = (ServiceException) e;

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpStatus httpStatus = HttpStatus.OK;
		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}
		return handleExceptionInternal(exception, exception.getErrorInfo(), headers, httpStatus, request);
	}

	/**
	 * handle MaxUploadSizeExceededException
	 * 
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ResponseEntity<Object> handleMaxUploadSizeExceededException(RuntimeException e, WebRequest request) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		HttpStatus httpStatus = HttpStatus.OK;
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}

		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1015_ERROR_CODE,
				CommonConstants.E1015_ERROR_DESCRIPTION);
		return handleExceptionInternal(e, errorInfo, headers, httpStatus, request);

	}

	/**
	 * handle hibernate exceptions
	 * 
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(HibernateException.class)
	public ResponseEntity<Object> handleHibernateException(RuntimeException e, WebRequest request) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		HttpStatus httpStatus = HttpStatus.OK;
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}

		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1029_ERROR_CODE,
				CommonConstants.E1029_ERROR_DESCRIPTION);
		logger.info(e);
		return handleExceptionInternal(e, errorInfo, headers, httpStatus, request);

	}

	/**
	 * handle invalid method type exception
	 * 
	 * @param ex
	 * @param headers
	 * @param httpstatus
	 * @param request
	 * @return
	 */
	@Override
	public ResponseEntity<Object> handleHttpRequestMethodNotSupported(

			HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus httpStatus, WebRequest request) {
		headers.setContentType(MediaType.APPLICATION_JSON);
		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		httpStatus = HttpStatus.OK;
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}
		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1030_ERROR_CODE,
				CommonConstants.E1030_ERROR_DESCRIPTION);
		return handleExceptionInternal(ex, errorInfo, headers, httpStatus, request);

	}

	/**
	 * handle type of parameters
	 * 
	 * @param ex
	 * @param headers
	 * @param status
	 * @param request
	 * 
	 * @return
	 */
	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		headers.setContentType(MediaType.APPLICATION_JSON);
		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		status = HttpStatus.OK;
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			status = HttpStatus.BAD_REQUEST;

		}
		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1069_ERROR_CODE,
				CommonConstants.E1069_ERROR_DESCRIPTION);
		return handleExceptionInternal(ex, errorInfo, headers, status, request);
	}

	/**
	 * handle generic exception
	 * 
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleGenericException(RuntimeException e, WebRequest request) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ServletWebRequest req = (ServletWebRequest) request;
		String uri = req.getRequest().getRequestURI();
		HttpStatus httpStatus = HttpStatus.OK;
		if (uri.contains("/lms/")  || uri.contains("/gumtree")  ) {
			httpStatus = HttpStatus.BAD_REQUEST;

		}
		logger.info(e);

		logger.error(e);
		ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1113_ERROR_CODE,
				CommonConstants.E1113_ERROR_DESCRIPTION);
		return handleExceptionInternal(e, errorInfo, headers, httpStatus, request);

	}

	/**
	 * Handles Third Party Exception with response code as 400
	 * 
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler({ ThirdPartyException.class })
	protected ResponseEntity<Object> handleThirdPartyException(RuntimeException e, WebRequest request) {
		ThirdPartyException exception = (ThirdPartyException) e;

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		logger.error(e);
		HttpStatus customHttpStatus = exception.getHttpStatus();
		if (null != customHttpStatus) {
			httpStatus = customHttpStatus;
		}
		return handleExceptionInternal(exception, exception.getErrorInfo(), headers, httpStatus, request);
	}
}