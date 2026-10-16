package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
