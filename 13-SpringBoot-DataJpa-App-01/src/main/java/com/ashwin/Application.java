package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashwin.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		  ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		    UserService us = ctxt.getBean(UserService.class);
//		    us.printName(); 
//		    us.saveUser();
//		    us.getAllUser();
//		    us.getUserById();
//		    us.saveAllUsers();
//		    us.callFindByMethod();
//		    us.customCall();
		    us.callFindByMethod();
	}

}
