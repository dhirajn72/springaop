package com.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Dhiraj
 * @date 21/12/18
 */
@Aspect
public class AccountAspect {
    //@Pointcut("execution(com.spring.aop..*)")
    public void inWebLayer() {
        System.out.println("inWebLayer");
    }

    //@Pointcut("execution(com.spring.aop..*)")
    public void inServiceLayer() {
        System.out.println("inServiceLayer");
    }

    @Pointcut("execution(* com.spring.aop.Account.up*(..))")
    public void PC1() {
        System.out.println("inServiceLayer");
    }

    @Before("PC1()")
    public void before(){
    }


}
