package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashwin.dao.UserDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
           SpringApplication.run(Application.class, args);
           
	 
	}
}
