package com.ashwin.user;

import java.lang.reflect.Field;

public class Test {
      public static void main(String[] args) throws Exception{
		    
    	  Class<?> cls =  Class.forName("com.ashwin.user.User");
    	  
    	      Object obj =  cls.getDeclaredConstructor().newInstance();
    	      
    	      User us = (User)obj;
    	      
    	    us.printAge();
    	    
    	    Field field = cls.getDeclaredField("age");
    	    field.setAccessible(true);
    	    field.set(us,20);
    	    
    	    us.printAge();
    	  
	}
}
