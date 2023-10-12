package com.cristianrita.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
@Aspect
public class MethodExecutionAspect {
    @Before("@annotation(com.cristianrita.aop.LogMethodExecution)")
    public void logMethodExecution(JoinPoint joinPoint) {
        System.out.println("Method execution: " + joinPoint.getSignature().getName() + " with args: " + Arrays.stream(joinPoint.getArgs()).toList());
    }

}
