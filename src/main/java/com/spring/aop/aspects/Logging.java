package com.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {
    public void beginLogging(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Logging-beginLogging()");
        try {
            joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("Caught exception !!");
        }
        System.out.println("Logging-beginLogging()");
    }

    public void endLogging() {
        System.out.println("Logging-endLogging()");
    }
}