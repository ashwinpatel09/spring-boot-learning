package com.ashwin.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    
	@GetMapping("/msg")
	public String getWelcomeMsg() {
		  String msg = "welcome to restController..";
		   return msg;
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg(){		  
		String msg = "hello Good Morning...";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
}
