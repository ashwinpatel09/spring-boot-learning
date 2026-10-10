package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.Enrollment;
import com.ashwin.entity.EnrollmentId;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentId>{
           
}
