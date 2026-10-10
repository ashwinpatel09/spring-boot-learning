package com.ashwin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ashwin.entity.Student;
import com.ashwin.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	   @Bean
	    CommandLineRunner run(StudentRepository studentRepository) {
	        return args -> {

	            Student student1 = new Student();
	            student1.setName("Ashwin");
	            student1.setCourse("Java");

	            Student savedStudent1 = studentRepository.save(student1);
	            System.out.println("Generated ID: " + savedStudent1.getId());

	            Student student2 = new Student();
	            student2.setName("Rahul");
	            student2.setCourse("Spring Boot");

	            Student savedStudent2 = studentRepository.save(student2);
	            System.out.println("Generated ID: " + savedStudent2.getId());
	        };
	    }

}
