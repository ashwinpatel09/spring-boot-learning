package com.ashwin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ashwin.entity.UserInfo;
import com.ashwin.repo.UserRepository;

@Service
public class UserService {
	@Autowired
     private UserRepository userRepo;
	
	//delete record by hql query
	public void deleteUserByHql() {
		  userRepo.deleteUser(105);
	}
	
	//perform sorting 
	public void doSorting() {
		  Sort sort  = Sort.by("name","age").descending();
		   List<UserInfo> user = userRepo.findAll(sort);
		   user.forEach(System.out::println);
	}
	
	//perform pagination
	public void doPagination() {
		  Integer pageNumber = 1;
		  Integer pageSije = 2;
		   
		  PageRequest pageRequest =  PageRequest.of(pageNumber-1,pageSije);
		      Page<UserInfo> all = userRepo.findAll(pageRequest);
		      List<UserInfo> content = all.getContent();
		      content.forEach(System.out::println);
	}
	
	//query By Example 
	public void qbe() {
		  UserInfo user = new UserInfo();
		  user.setCountry("India");
		  user.setGender("Male");
		  Example<UserInfo> of = Example.of(user);
		  List<UserInfo> all = userRepo.findAll(of);
		  all.forEach(System.out::println);
	}
}
