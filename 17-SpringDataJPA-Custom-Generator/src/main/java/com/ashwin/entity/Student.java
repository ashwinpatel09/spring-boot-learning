package com.ashwin.entity;

import com.ashwin.generator.StudentId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {
	@Id
	@StudentId
     private String id;
     private String name;
     private String course;
}
