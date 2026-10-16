package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
