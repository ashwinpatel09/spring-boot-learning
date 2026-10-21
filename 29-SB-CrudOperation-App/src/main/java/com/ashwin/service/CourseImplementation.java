package com.ashwin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ashwin.binding.Course;
import com.ashwin.repo.CourseRepository;

@Service
public class CourseImplementation  implements CourseService{
     @Autowired  
	private CourseRepository courseRepo;
	
	    @Override
	    public Course saveAndUpdateCourse(Course course) {
	    	 Course save = courseRepo.save(course);
	    	return save;
	    }
	    
	    @Override
	    public List<Course> getAllCourse() {
	    	    List<Course> all = courseRepo.findAll();
	    	    return all;
	    }
	    
	    @Override
	    public Course getCourseById(Integer cid) {
	    	    Optional<Course> byId = courseRepo.findById(cid);
	    	    return byId.orElse(null);
	    }
	    
	    @Override
	    public String deleteCourseById(Integer cid) {
	    	   courseRepo.deleteById(cid);
	    	return "record deleted successfully";
	    }
}
