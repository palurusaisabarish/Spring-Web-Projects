package com.NextEducation.JobApp.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAscept {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAscept.class);
	
	//@Before("execution(* com.NextEducation.JobApp.*(..)")
	@Before("execution(* com.NextEducation.JobApp.RestController.JobPostApiController.*(..))") // Added missing .* and )
	public void getJob(JoinPoint joinPoint) {
		logger.info("Method Called  "+ joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.NextEducation.JobApp.RestController.JobPostApiController.*(..))") // Added missing .* and )
	public void getJobb() {
		logger.info("Method Exceution Completed");
	}
	
	//afterThrowing - exception
	//afterReturning
	
	
	
}
