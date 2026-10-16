package com.ashwin.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	
	@ManyToMany
	@JoinTable(
	   name = "student_course",
	   joinColumns = @JoinColumn(name = "student_id"),
	   inverseJoinColumns = @JoinColumn(name = "course_id")
			)
	private List<Course> courses = new ArrayList<>();
}
