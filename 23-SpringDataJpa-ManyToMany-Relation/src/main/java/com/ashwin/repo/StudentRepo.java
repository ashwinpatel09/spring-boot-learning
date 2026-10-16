package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
