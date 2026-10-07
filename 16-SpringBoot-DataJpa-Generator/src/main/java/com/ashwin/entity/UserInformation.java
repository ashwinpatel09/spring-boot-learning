package com.ashwin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;
    private String gender;
    private Integer age;
}
