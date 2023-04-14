package com.itheima.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAdvice {
    @Pointcut("execution(* com.itheima.service.impl.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("advice before");
    }

    @AfterReturning("pointcut()")
    public void after() {
        System.out.println("advice after");
    }
}
