package com.ashwin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
