package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashwin.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctxt =  SpringApplication.run(Application.class, args);
	     StudentService bean = ctxt.getBean(StudentService.class);
	     bean.saveStudent();
	}

}
