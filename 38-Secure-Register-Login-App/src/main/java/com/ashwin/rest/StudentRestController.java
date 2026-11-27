package com.ashwin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.entity.Student;
import com.ashwin.service.StudentService;

@RestController
public class StudentRestController {
	
    @Autowired
	private StudentService studentService;
    
    @Autowired
    private AuthenticationManager authManager;
    
    @PostMapping("/register")
    public ResponseEntity<Student> register(@RequestBody Student student){
    	      Student saveStudent = studentService.saveStudent(student);
    	      return new ResponseEntity<>(saveStudent,HttpStatus.CREATED);
    }
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Student student){
    	  UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(student.getEmail(), student.getPwd());
    	  
    	  try {
    		  Authentication authentication = authManager.authenticate(authToken);
    		  if(authentication.isAuthenticated()) {
    			  return new ResponseEntity<>("welcome to ashok it",HttpStatus.OK);
    		  }
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  
    	  return new ResponseEntity<>("Invalid Creadential",HttpStatus.BAD_REQUEST);
    }
}
