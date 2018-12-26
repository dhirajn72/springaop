package com.spring.aop;

import com.spring.aop.aspects.FundTransfer;
import com.spring.aop.aspects.Logging;
import com.spring.aop.aspects.Transaction;
import org.springframework.context.annotation.*;

/**
 * @author Dhiraj
 * @date 21/12/18
 */
//@Configuration
//@ImportResource({"applicationContext.xml"})
public class BeansConfiguration {
  //  @Bean
    public Logging getLogging(){
       // System.out.println("getLogging()");
        return new Logging();
    }
    //@Bean
    public FundTransfer getFundTransfer(){
       // System.out.println("getFundTransfer()");
        return new FundTransfer();
    }
    //@Bean
    public Transaction getTransaction(){
       // System.out.println("getTransaction()");
        return new Transaction();
    }

    //@Bean
    public Account getAccount(){
       // System.out.println("getAccount()");
        return new Account();
    }

}
