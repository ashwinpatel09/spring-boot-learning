package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashwin.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =  SpringApplication.run(Application.class, args);
	    PersonService bean = ctxt.getBean(PersonService.class);
	    bean.savePersonAndPassport();
	    bean.findPersonAndPassport(3);
	}

}
