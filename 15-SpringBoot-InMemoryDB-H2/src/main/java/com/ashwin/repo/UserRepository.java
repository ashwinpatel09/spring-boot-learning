package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
             
} 
