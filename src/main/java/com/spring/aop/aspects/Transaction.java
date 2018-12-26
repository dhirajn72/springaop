package com.spring.aop.aspects;

import org.springframework.dao.DataAccessException;

public class Transaction {

	public void beginTransaction() {
		System.out.println("Transaction-beginTransaction()");
	}

	public void commitTransaction() {
		System.out.println("Transaction-commitTransaction()");
	}

	public void rollbackTransaction(DataAccessException dataAccessException ) {
		System.out.println("Transaction-rollbackTransaction()");
		//e.printStackTrace();
		/*try {
			throw dataAccessException;
		}
		catch (DataAccessException e){
			System.out.println("Handled exception");
		}*/
	}
}