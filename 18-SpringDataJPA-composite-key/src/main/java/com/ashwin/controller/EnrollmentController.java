package com.ashwin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.entity.Enrollment;
import com.ashwin.service.EnrollmentService;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
	
    @Autowired
	private EnrollmentService enrollService;
    
    @PostMapping("/{studentId}/{courseId}")
    public Enrollment saveEnrollment(@PathVariable Long studentId , @PathVariable String courseId) {
    	     
    	return enrollService.saveEnrollment(studentId, courseId);
    }
    
    @GetMapping("/{studentId}/{courseId}")
    public Enrollment getEnrollment(
            @PathVariable Long studentId,
            @PathVariable String courseId) {

        return enrollService.getEnrollment(studentId, courseId);
    }
}  
