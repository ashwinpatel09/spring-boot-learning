package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.entity.Student;
import com.ashwin.repo.StudentRepo;

import com.ashwin.entity.Course;
import com.ashwin.repo.CourseRepo;

@Service
public class StudentService {
	 @Autowired
     private StudentRepo stdRepo;
	 @Autowired
	 private CourseRepo courseRepo;
	 
	 public Student saveStudent(Student student) {
		    return stdRepo.save(student);
	 }
	 
	 public Student addCourseToStudent(Integer studentId , Integer courseId) {
		   Student std = stdRepo.findById(studentId).orElseThrow();
		   Course course = courseRepo.findById(courseId).orElseThrow();
		   
		   if (!std.getCourses().contains(course)) {
			    std.getCourses().add(course);
			}
		   return stdRepo.save(std);
	 }
	 
	 public Student getStudentById(Integer studentId) {
		  return stdRepo.findById(studentId).orElseThrow();
	 }
}
