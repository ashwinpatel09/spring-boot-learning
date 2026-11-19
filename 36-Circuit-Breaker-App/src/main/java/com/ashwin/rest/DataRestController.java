package com.ashwin.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController {
	
    @GetMapping("/data")  
    @CircuitBreaker(fallbackMethod = "m2" , name="myService")
	public String m1() {
		  System.out.println("redis method called");
		  
		  return "redis data";
	}
	
	public String m2(Throwable t) {
		   System.out.println("database method called");
		   return "database data";
	}
}
