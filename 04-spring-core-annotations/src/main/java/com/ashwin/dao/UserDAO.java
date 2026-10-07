package com.ashwin.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
      public UserDAO() {
    	  System.out.println("DAO constructer");
      }
      
      public String getNameById(int id) {
    	     if(id == 10) {
    	    	 return "aswhin patel" ;
    	     }
    	     else {
    	    	 return "rahul birla";
    	     }
      }
}
