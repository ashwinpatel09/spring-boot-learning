package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.entity.Course;
import com.ashwin.repo.CourseRepo;

@Service
public class CourseService {
	@Autowired
    private CourseRepo courseRepo;
	
	public Course saveCourse(Course course){
		 return courseRepo.save(course);
	}
}
