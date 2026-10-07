package com.ashwin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashwin.config.AppConfig;
import com.ashwin.service.UserService;

public class MyApp {
      
	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		   
		      UserService us = ctxt.getBean(UserService.class);
		      us.getName();
	}
}
