package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.entity.User;
import com.ashwin.repo.UserRepository;

@Service
public class UserService {
	@Autowired
   private UserRepository userRepo;
   
   public void getInMemoryDB() {
	   User us = new User();
	   us.setUserId(101);
	   us.setName("virat");
	   us.setGender("Male");
	   us.setAge(40);
	   userRepo.save(us);
	   
   }
}
