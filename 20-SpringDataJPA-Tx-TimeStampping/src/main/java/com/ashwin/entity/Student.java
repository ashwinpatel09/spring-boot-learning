package com.ashwin.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private String name;
     private String city;
     
     @CreationTimestamp
     @Column(updatable = false)
     private LocalDate createdDate;
     
     @UpdateTimestamp
     private LocalDate updatedDate;
}
