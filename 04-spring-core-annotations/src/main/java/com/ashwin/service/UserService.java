package com.ashwin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ashwin.dao.UserDAO;

@Service
public class UserService {
     @Autowired
	private UserDAO userdao;
	
	public UserService(){
		System.out.println("service constructer");
	}
	
	public void getName() {
		  String name = userdao.getNameById(10);  
		  System.out.println(name);
	}
}
