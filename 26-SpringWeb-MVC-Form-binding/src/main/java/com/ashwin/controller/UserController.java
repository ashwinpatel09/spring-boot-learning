package com.ashwin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashwin.dto.User;

@Controller
public class UserController {
     @GetMapping("/")   
	public String getUser(Model model){
		   
		User userObject = new User();
		model.addAttribute("user", userObject);
		
		return "index";
	}
     @PostMapping("/saveUser")
     public String handleSubmitButton(User user , Model model) {
    	  System.out.println(user);
    	  model.addAttribute("msg", user.getName() + " add successfully");
    	  return "success";
     }
}
