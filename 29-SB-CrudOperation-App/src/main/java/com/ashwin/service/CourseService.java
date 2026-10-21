package com.ashwin.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ashwin.binding.Course;

@Service
public interface CourseService {
       public Course saveAndUpdateCourse(Course course);
       
       public List<Course> getAllCourse();
       
       public Course getCourseById(Integer cid);
       
       public String deleteCourseById(Integer cid);     
}
