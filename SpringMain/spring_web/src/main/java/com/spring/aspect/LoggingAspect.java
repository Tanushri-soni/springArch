package com.spring.aspect;

import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 
 * Aspect to handle entry and exit log
 *
 */
@Component
@Aspect
public class LoggingAspect {

	private final Logger logger = Logger.getLogger("Aspect Logging");

	/**
	 * Handle entry logs before execution of any method
	 * 
	 * @param joinPoint
	 * @throws Throwable
	 */

	@Before("execution(* com.spring.*.*.*..*(..))")
	public void logBefore(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		logger.info("Entering:" + joinPoint.getTarget().getClass().getName() + ":" + method.getName() + "()");

	}

	/**
	 * handle exiting logs after execution of any method
	 * 
	 * @param joinPoint
	 * @throws Throwable
	 */
	@After("execution(* com.spring.*.*.*..*(..))")
	public void logAfter(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		logger.info("Exiting:" + joinPoint.getTarget().getClass().getName() + ":" + method.getName() + "()");

	}
}
