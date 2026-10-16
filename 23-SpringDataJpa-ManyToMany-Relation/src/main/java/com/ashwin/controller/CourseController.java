package com.ashwin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.entity.Course;
import com.ashwin.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	 @Autowired
     private CourseService courseService;
	 
	 @PostMapping
	 public Course saveCourse(@RequestBody Course course) {
		 return courseService.saveCourse(course);
	 }
}
