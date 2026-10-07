package com.ashwin.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.entity.UserInfo;
import com.ashwin.repo.UserInfoRepo;

@Service
public class UserService {
	    @Autowired
		private UserInfoRepo userRepo;
		
		public void printName() {
			String name = userRepo.getClass().getName();
			System.out.println(name);
		}
		
		//to insert the record
		public void saveUser() {
			UserInfo us = new UserInfo();
			us.setUserId(102);
			us.setName("Rahul");
			us.setGender("Male");
			us.setCountry("India");
			us.setAge(24);
			
			userRepo.save(us);
			System.out.println("user is inserted");
		}
		
		//insert list of records
		public void saveAllUsers() {
			UserInfo us1 = new UserInfo();
			us1.setUserId(103);
			us1.setName("Gayle");
			us1.setGender("Male");
			us1.setCountry("WestIndies");
			us1.setAge(50);
			
			UserInfo us2 = new UserInfo();
			us2.setUserId(104);
			us2.setName("abd");
			us2.setGender("Male");
			us2.setCountry("southAfrica");
			us2.setAge(45);
			
			UserInfo us3 = new UserInfo();
			us3.setUserId(105);
			us3.setName("williamson");
			us3.setGender("Male");
			us3.setCountry("newjiland");
			us3.setAge(60);
			
			List<UserInfo> list = Arrays.asList(us1,us2,us3);
			 Iterable<UserInfo>  ans = userRepo.saveAll(list);
			 ans.forEach(System.out::println);
			
		}
		
		//get all user
		public void getAllUser() {
			   Iterable<UserInfo> users =  userRepo.findAll();
			     users.forEach(System.out::println);
		}
		
		//find user by id
		public void getUserById() {
			   Optional<UserInfo> user= userRepo.findById(102);
			      System.out.println(user);
		}
		
		public void callFindByMethod() {
//			  List<UserInfo> user = userRepo.findByCountry("WestIndies");
//			  user.forEach(System.out::println);
			
//			List<UserInfo> users = userRepo.findByAgeGreaterThanEqual(40);
//			users.forEach(System.out::println);
			
			List<UserInfo> users = userRepo.findByNameAndAgeLessThan("Ashwin", 25);
			users.forEach(System.out::println);
		}
		
		//custom query
		public void customCall() {
			   List<UserInfo> users =  userRepo.m1();
			   users.forEach(System.out::println);
			    
		}
}
