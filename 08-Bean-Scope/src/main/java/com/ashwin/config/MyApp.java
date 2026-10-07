package com.ashwin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ashwin")
public class MyApp {
     public MyApp() {
		System.out.println("config constructer called");
	}
}
