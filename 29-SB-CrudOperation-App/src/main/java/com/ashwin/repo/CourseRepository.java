package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ashwin.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
