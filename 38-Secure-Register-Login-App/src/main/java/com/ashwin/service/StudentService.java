package com.ashwin.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ashwin.entity.Student;
import com.ashwin.repository.StudentRepository;

@Service
public class StudentService implements UserDetailsService{
	
    @Autowired
	private StudentRepository studentRepo;
    
    @Autowired
    private PasswordEncoder pwdEncoder;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	   Student student = studentRepo.findByEmail(email);
    	   return  new User(student.getEmail(),student.getPwd(),Collections.emptyList());
    }
    
    public Student saveStudent(Student student) {
	     String encodedPwd = pwdEncoder.encode(student.getPwd());
	     student.setPwd(encodedPwd);
	     Student s = studentRepo.save(student);
	     return s;
    }
}
