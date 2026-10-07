package com.ashwin.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashwin.config.AppConfig;
import com.ashwin.dao.StudentDao;
import com.ashwin.dto.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentDao student = ctxt.getBean(StudentDao.class);
//		Student s1 = new Student();
//		s1.setId(102);
//		s1.setName("rohit");
//		s1.setCity("mumbai");
//		int effectRow =  student.save(s1);
//		System.out.println(effectRow);
		
		List<Student> list = student.findAll();
		list.forEach(System.out::println);

	}

}
