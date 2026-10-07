package com.ashwin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
	 @Id
     private Integer userId;
     private String name;
     private String gender;
     private Integer age;    
}
