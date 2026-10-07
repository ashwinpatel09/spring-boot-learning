package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.UserInformation;

public interface UserRepository extends JpaRepository<UserInformation, Integer>{

}
