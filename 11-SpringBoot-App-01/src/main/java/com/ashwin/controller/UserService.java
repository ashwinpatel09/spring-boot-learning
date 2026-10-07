package com.ashwin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
      
	@GetMapping("/")
	public String getName() {
		return "welcome to springBoot";
	}
}
