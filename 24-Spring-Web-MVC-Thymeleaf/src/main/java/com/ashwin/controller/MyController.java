package com.ashwin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/msg")
public class MyController {
	@GetMapping("/welcome")
     public ModelAndView getWelcomeMessage() {
    	   ModelAndView mav = new ModelAndView();
    	   
    	   mav.addObject("msg", "Welcome to SpringMVC ,Ashwin");
    	   mav.setViewName("index");
    	   
    	   return mav;
     }
	
	@GetMapping("/greet")
	public String getGreetingMessage(Model model) {
		    model.addAttribute("msg","hello ashwin Good Morning");
		    
		    return "index";
	}
	@GetMapping("/text")
	@ResponseBody
	public String getTextMsg() {
		  return "this is the text message from controller direectly";
	}
}
