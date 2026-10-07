package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.entity.UserInformation;
import com.ashwin.repo.UserRepository;

@Service
public class UserService {
    
	@Autowired
	private UserRepository userRepo;
	
	public void useGeneratorMethod() {
		  UserInformation user = new UserInformation();
		  user.setName("virat");
		  user.setGender("Male");
		  user.setAge(40);
		  
		  userRepo.save(user);
	}
}
