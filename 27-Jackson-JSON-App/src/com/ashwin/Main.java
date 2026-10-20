package com.ashwin;

import java.io.File;
import java.util.Arrays;

import com.ashwin.binding.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws Exception{
//       Main.convertJavaToJson();
		 Main.jsonToJava();
	}
	
	public static void convertJavaToJson() throws Exception{
		Customer c1 = new Customer();
		c1.setId(101);
		c1.setName("ashwin");
		c1.setGender("male");
		c1.setPhno(93472474l);
		
		Customer c2 = new Customer();
		c2.setId(102);
		c2.setName("Virat");
		c2.setGender("male");
		c2.setPhno(67572474l);
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.writeValue(new File("customer.json"),Arrays.asList(c1,c2));
		 System.out.println("json is created");	    
	}
	
	public static void jsonToJava() throws Exception{
		   ObjectMapper mapper = new ObjectMapper();
		   Customer[] c = mapper.readValue(new File("customer.json"), Customer[].class);
		  for(Customer name : c) {
			  System.out.println(name);
		  }
	}
}
