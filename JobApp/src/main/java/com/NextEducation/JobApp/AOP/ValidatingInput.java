package com.NextEducation.JobApp.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidatingInput {

    private static final Logger logger = LoggerFactory.getLogger(ValidatingInput.class);

    @Around("execution(* com.NextEducation.JobApp.RestController.JobPostApiController.*(..)) && args(postId)")
    public Object validatePostId(ProceedingJoinPoint joinPoint, Integer postId) throws Throwable {
        
        logger.info("Original postId: {}", postId);

        if (postId < 0) {
            logger.warn("Negative postId detected. Converting to positive.");
            postId = Math.abs(postId);
            logger.info("Updated postId: {}", postId);
        }

        Object result = joinPoint.proceed(new Object[]{postId});
        return result;
    }
}