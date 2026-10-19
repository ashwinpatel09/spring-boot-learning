package com.ashwin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashwin.binding.User;

@Controller
public class UserController {
    
	 @GetMapping("/msg")
	 @ResponseBody
	 public String getWelcomeMsg() {		   
		 return "hello ashwin ki haal hai";
	 }
	 
	 @GetMapping("/user")
	 @ResponseBody
	 public User getUser() {
		  User u = new User();
		  u.setId(101);
		  u.setName("ashwin");
		  u.setGender("Male");
		  u.setPhno(999333357l);
		  return u;
	 }
	 
	 @GetMapping("/users")
	 @ResponseBody
	 public List<User> getUsers() {
		  User u1 = new User();
		  u1.setId(101);
		  u1.setName("ashwin");
		  u1.setGender("Male");
		  u1.setPhno(999333357l);
		  
		  User u2 = new User();
		  u2.setId(102);
		  u2.setName("kohli");
		  u2.setGender("Male");
		  u2.setPhno(944333357l);
		  
		  return Arrays.asList(u1,u2);
	 }
}
