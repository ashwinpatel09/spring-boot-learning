package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashwin.entity.Student;
import com.ashwin.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
   private StudentRepository studentRepo;
	
	@Transactional
	public void saveStudent() {
		Student us1 = new Student();
	    us1.setName("Rohit");
	    us1.setCity("Mumbai");
	    studentRepo.save(us1);
	    
//	   int  i = 10/0;
	    Student us2 = new Student();    
	    us2.setName("kohli");
	    us2.setCity("Banglore");
	    studentRepo.save(us2);
	}
}
