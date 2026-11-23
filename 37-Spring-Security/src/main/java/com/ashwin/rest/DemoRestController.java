package com.ashwin.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
    @GetMapping("/admin/home")
    public String getAdmin() {
    	return "Admin pannel";
    }
    @GetMapping("/manager/home")
    public String getManager() {
    	return "Manager pannel";
    }
    @GetMapping("/student/home")
    public String getStudent() {
    	return "Student pannel";
    }
    @GetMapping("/public/contact")
    public String getContact() {
    	 return "please contanct on ph.no.-9731264894";
    }
    @GetMapping("/public/about")
    public String getAbout() {
    	return "Ashok It Hyderabad";
    }
}
