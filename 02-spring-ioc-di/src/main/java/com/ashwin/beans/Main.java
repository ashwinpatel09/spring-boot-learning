package com.ashwin.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
              ApplicationContext cntxt  = new ClassPathXmlApplicationContext("beans.xml");
              
              ATM atm = cntxt.getBean(ATM.class);
              
              atm.call();
	}

}
