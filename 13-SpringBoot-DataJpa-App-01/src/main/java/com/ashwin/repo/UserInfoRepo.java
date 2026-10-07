package com.ashwin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashwin.entity.UserInfo;

public interface UserInfoRepo extends CrudRepository<UserInfo, Integer>{
     
	  //retrieve record by country name
	  public List<UserInfo> findByCountry(String country);
	  
	  //retrieve record by age 
	  public List<UserInfo> findByAgeGreaterThanEqual(int age);
	  
//	  retrieve recor whose age is below 25 and gender is male
	  public List<UserInfo> findByNameAndAgeLessThan(String name , int age);
	  
	  //custome query
	  @Query(value="Select * from user_info" , nativeQuery = true)
	  public List<UserInfo> m1();
		  
}
