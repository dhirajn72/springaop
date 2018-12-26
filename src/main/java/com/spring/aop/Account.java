package com.spring.aop;

import org.springframework.dao.DataAccessException;

public class Account {

	public void updateAccount() {
		System.out.println("Account-updateAccount()");
		//throw new AOPDataAccessException("Method does not have parameters !!");
	}
	public void requestPassword() {
		System.out.println("Account-requestPassword()");
	}

	public void applyCheckBook() {
		System.out.println("Account-applyCheckBook()");
	}

}