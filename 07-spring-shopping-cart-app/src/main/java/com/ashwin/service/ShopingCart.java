package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ashwin.payment.Payment;

@Service
public class ShopingCart {
	@Autowired
	@Qualifier("debitcard")
	private Payment payMode;
	
	public ShopingCart() {
		System.out.println("shopping cart constructer");
	}
     
	public void placeOrder() {
		   String payed =  payMode.pay();
		   System.out.println(payed);
	}
}
