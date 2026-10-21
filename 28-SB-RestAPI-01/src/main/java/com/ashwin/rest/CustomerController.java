package com.ashwin.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.dto.Customer;

@RestController
public class CustomerController {
	
	@GetMapping("/getMsg")
	public ResponseEntity<String> getCustomerName(@RequestParam String name) {
		 String msg = " hii " + name + " you are our new customer";
		 return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	//Get Customer 
     @GetMapping( value = "/customer" , produces = "application/json") 
	 public ResponseEntity<Customer> getCustomer(){	    
    	   Customer c1 = new Customer(101,"ashwin","male");
    	   return new ResponseEntity<Customer>(c1,HttpStatus.OK);
	 }
     
     @GetMapping( value = "/customers" , produces = "application/json") 
	 public ResponseEntity<List<Customer>> getCustomers(){	    
    	   Customer c1 = new Customer(101,"ashwin","male");
    	   Customer c2 = new Customer(102,"virat","male");
    	   Customer c3 = new Customer(103,"samantha","Female");
    	   List<Customer> list = Arrays.asList(c1,c2,c3);
    	   return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	 }
     @PostMapping("/customerInfo")
     public ResponseEntity<Customer> getCustomerDetail(@RequestBody Customer customer){
    	    System.out.println(customer);
    	    return new ResponseEntity<Customer>(customer,HttpStatus.CREATED);
     }
}
