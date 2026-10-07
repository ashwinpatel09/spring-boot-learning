package com.ashwin.payment;

import org.springframework.stereotype.Repository;

@Repository("debitcard")
public class DebitCardPayment implements Payment{
	
	  public DebitCardPayment() {
		System.out.println("debitcard constructer");
	}
	
     @Override
    public String pay() {
    	return "payment done by debit card"; 	
    }
}
