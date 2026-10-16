package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer>{

}
