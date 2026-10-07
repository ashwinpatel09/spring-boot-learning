package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.dao.IUserDao;

@Service
public class UserService {
	 @Autowired
     private IUserDao userDao;
     
	public UserService() {
		System.out.println("Sercice Constructer");
	}	
	
	public void getName() {
	     String name = userDao.getName(10);
	     System.out.println(name);
	}
}
