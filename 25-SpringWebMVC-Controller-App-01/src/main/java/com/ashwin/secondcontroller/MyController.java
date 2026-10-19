package com.ashwin.secondcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.binding.User;

@RestController
public class MyController {
    @GetMapping("/msg1")
	public String getName(@RequestParam String name , @RequestParam String lname) {
		  String str = "hii " + " " + name +" "+ lname;
		  return str;
	}
    @GetMapping("/greet/{m1}/{m2}")
    public String getGreetMsg(@PathVariable String m1 ,@PathVariable String m2) {
    	 String greet = "hii "+ m1 + " " + m2;
    	 return greet;
    }
    @PostMapping("/getUser")
    public User getUser(@RequestBody User user) {
    	
    	return user;
    }
}
