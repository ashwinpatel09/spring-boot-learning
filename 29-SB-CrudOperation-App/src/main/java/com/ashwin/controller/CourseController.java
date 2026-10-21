package com.ashwin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.binding.Course;
import com.ashwin.service.CourseImplementation;

@RestController
public class CourseController {
	  @Autowired
      private CourseImplementation courseImpl;
      @PostMapping("/saveCourse")
      public ResponseEntity<Course> getCourse(@RequestBody Course course){
    	      Course saveAndUpdateCourse = courseImpl.saveAndUpdateCourse(course);
    	      return new ResponseEntity<Course>(saveAndUpdateCourse,HttpStatus.CREATED);
      }
      @GetMapping("/getCourses")
      public ResponseEntity<List<Course>> getAllCourses(){
    	  List<Course> allCourse = courseImpl.getAllCourse();
    	  return new ResponseEntity<List<Course>>(allCourse,HttpStatus.OK);
      }
      @GetMapping("/getCourse/{cid}")
      public ResponseEntity<Course> getCourseById(@PathVariable Integer cid){
    	        Course courseById = courseImpl.getCourseById(cid);
    	        return new ResponseEntity<Course>(courseById,HttpStatus.OK);
      }
      @DeleteMapping("/deleteCourse/{cid}")
      public ResponseEntity<String> deleteById(@PathVariable Integer cid){
    	  courseImpl.deleteCourseById(cid);
    	  return new ResponseEntity<String>("recored delete successful",HttpStatus.OK);
      }
      
      @PutMapping("/updateCourse")
      public ResponseEntity<Course> updateCourse(@RequestBody Course course){
    	      Course saveAndUpdateCourse = courseImpl.saveAndUpdateCourse(course);
    	      return new ResponseEntity<Course>(saveAndUpdateCourse,HttpStatus.OK);
      }
}
