package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.ashwin.entity.Enrollment;
import com.ashwin.entity.EnrollmentId;
import com.ashwin.repo.EnrollmentRepository;

@Service
public class EnrollmentService {
	 @Autowired
     private EnrollmentRepository enrollRepo;
	 
	 @Transactional
	 public Enrollment saveEnrollment(Long studentId , String courseId) {
		      
		 EnrollmentId enrollId = new EnrollmentId(studentId,courseId);
		 
		 Enrollment enroll = new Enrollment(enrollId);
		 
		 return enrollRepo.save(enroll);
	 }
	 
	 public Enrollment getEnrollment(
		        Long studentId, String courseId) {

		    EnrollmentId id = new EnrollmentId(studentId, courseId);

		    return enrollRepo.findById(id).orElseThrow(() -> new ResponseStatusException(
	                HttpStatus.NOT_FOUND,
	                "Enrollment not found"));
		}
     
}
