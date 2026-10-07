package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashwin.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context	= SpringApplication.run(Application.class, args);
	 			UserService us = context.getBean(UserService.class);
//	 			us.deleteUserByHql();
//	 			us.doSorting();
//	 			us.doPagination();
	 			us.qbe();
	}

}
