package com.ashwin.payment;

import org.springframework.stereotype.Repository;

@Repository("creditcard")
public class CreditCardPayment implements Payment {
	
	public CreditCardPayment() {
		System.out.println("creditcard constructer");
	}
	
     @Override
    public String pay() {
     	return "payment done by credit card"; 
    }
} 
