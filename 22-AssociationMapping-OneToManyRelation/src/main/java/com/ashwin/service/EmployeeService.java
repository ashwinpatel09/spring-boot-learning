package com.ashwin.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.entity.Address;
import com.ashwin.entity.Employee;
import com.ashwin.repo.AddressRepo;
import com.ashwin.repo.EmployeeRepo;

@Service
public class EmployeeService {
     @Autowired
	private EmployeeRepo empRepo;
     
	@Autowired
	private AddressRepo addRepo;
	
	public void saveEmployeeAndPerson() {
		Address add1 = new Address();
		add1.setCity("Katora");
		add1.setState("MP");
		add1.setType("Permanent");
		
		Address add2 = new Address();
		add2.setCity("Bengaluru");
		add2.setState("Karnataka");
		add2.setType("Current");
		
		Employee e = new Employee();
		e.setEmpName("Ashwin");
		e.setEmpGender("Male");
		
		//Association Mapping
		add1.setEmpl(e);
		add2.setEmpl(e);
		
		e.setAddList(Arrays.asList(add1,add2));
		
		empRepo.save(e);
	}
	
	public void deleteEmployeeById(int id) {
		  empRepo.deleteById(id);
	}
	
	public void deleteAddressById(int id) {
		addRepo.deleteById(id);
	}
} 
