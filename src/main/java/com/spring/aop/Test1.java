package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.Account;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext();
		//applicationContext.scan("com.spring.aop");
		//applicationContext.refresh();

		Account account = (Account) applicationContext.getBean(Account.class);
		account.updateAccount();

	}
}