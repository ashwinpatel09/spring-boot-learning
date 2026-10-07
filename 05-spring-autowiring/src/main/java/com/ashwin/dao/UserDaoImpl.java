package com.ashwin.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
	
	public UserDaoImpl() {
		System.out.println("DAO constructer");
	}
	
     @Override
    public String getName(int id) {
    	  return "virat kohli";
    }
} 
