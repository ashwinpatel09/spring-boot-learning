package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashwin.dto.Product;
import com.ashwin.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	     ProductService bean = ctxt.getBean(ProductService.class);
//	     bean.getProductJsonString(2);
//	     bean.getProductJsonObject(2);
	    bean.getProductAsync(1);
	}

}
