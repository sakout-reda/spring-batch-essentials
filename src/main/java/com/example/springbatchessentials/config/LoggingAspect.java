package com.example.springbatchessentials.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.example.springbatchessentials.web.*.*(..))")
    public void logBeforeController(JoinPoint joinPoint) {
        log.info("Start executing : {} in Controller", joinPoint.getSignature().getName());
    }

    @Before("execution(* com.example.springbatchessentials.services.*.*(..))")
    public void logBeforeService(JoinPoint joinPoint) {
        log.info("Start executing : {} in Service", joinPoint.getSignature().getName());
    }

    @Before("execution(* com.example.springbatchessentials.mappers.*.*(..))")
    public void logBeforeMapper(JoinPoint joinPoint) {
        log.info("Start executing method: {} in Mapper", joinPoint.getSignature().getName());
    }

    @Before("execution(* com.example.springbatchessentials.services.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        log.info("Before executing " + methodName + " with arguments: " + Arrays.toString(args));
    }

    @AfterReturning("execution(* com.example.springbatchessentials.*.*(..)) && (within(com.example.springbatchessentials.web..*) || within(com.example.springbatchessentials.services..*) || within(com.example.springbatchessentials.mappers..*))")
    public void logAfterReturning(JoinPoint joinPoint) {
        String packageName = joinPoint.getSignature().getDeclaringTypeName();
        String origin = packageName.substring(packageName.lastIndexOf('.') + 1);
        log.info("After executing method: {} in {}", joinPoint.getSignature().getName(), origin);
    }
}
