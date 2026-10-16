package com.ashwin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.entity.Student;
import com.ashwin.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
    private StudentService studentService;
	
	@PostMapping
	public Student savaStudent(@RequestBody Student student) {
		  return studentService.saveStudent(student);
	}
	@PutMapping("/{studentId}/courses/{courseId}")
	public Student assingCourse(
			@PathVariable Integer studentId ,
			@PathVariable Integer courseId 
			) {
		return studentService.addCourseToStudent(studentId, courseId);
	}
	@GetMapping("/{studentId}")
	public Student getStudentById(@PathVariable Integer studentId) {
		  return studentService.getStudentById(studentId);
	}
}
