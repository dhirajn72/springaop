package com.spring.aop;

import org.springframework.dao.DataAccessException;

/**
 * @author Dhiraj
 * @date 26/12/18
 */
public class AOPDataAccessException extends DataAccessException {
    public AOPDataAccessException(String msg) {
        super(msg);
    }
}
