package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashwin.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	     EmployeeService bean = ctxt.getBean(EmployeeService.class);
//	     bean.saveEmployeeAndPerson();
//	     bean.deleteEmployeeById(1);
	     bean.deleteAddressById(3);
	}

}
