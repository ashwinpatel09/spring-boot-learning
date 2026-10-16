package com.ashwin.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emplId;
	private String  empName;
	private String  empGender;
	
	@OneToMany(mappedBy = "empl" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Address> addList;
}
