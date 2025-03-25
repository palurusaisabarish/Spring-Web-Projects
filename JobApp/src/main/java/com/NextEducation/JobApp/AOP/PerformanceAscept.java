package com.NextEducation.JobApp.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAscept {

	
	private static final Logger logger = LoggerFactory.getLogger(PerformanceAscept.class);
	
	@Around("execution(* com.NextEducation.JobApp.RestController.JobPostApiController.*(..))")
	public Object mointorTime(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long start = System.currentTimeMillis(); //ms
		Object obj = joinPoint.proceed();
		long end = System.currentTimeMillis();
		
		logger.info("Time Taken : "+(end-start) + "ms");
		
		return obj;
	}
}
