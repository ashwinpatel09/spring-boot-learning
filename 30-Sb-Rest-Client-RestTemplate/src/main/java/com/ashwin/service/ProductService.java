package com.ashwin.service;

import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    
     public void getProductById(int id){
    	 String url = "https://api.restful-api.dev/objects/{id}";
    	 
    	 RestTemplate rt = new RestTemplate();
         ResponseEntity<String> forEntity = rt.getForEntity(url, String.class,id);
             @Nullable
			String body = forEntity.getBody();
             System.out.println(body);
     }
}
