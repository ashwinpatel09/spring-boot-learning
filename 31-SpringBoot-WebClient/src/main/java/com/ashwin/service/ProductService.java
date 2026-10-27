package com.ashwin.service;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashwin.dto.Product;

import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	 String url = "https://api.restful-api.dev/objects/{id}";
	 //syncronijation call to string     
	 public void getProductJsonString(Integer id) {
		 WebClient webClient = WebClient.create();
		  Mono<String> bodyToMono = webClient.get()
		                                      .uri(url,id)
		                                      .retrieve()
		                                      .bodyToMono(String.class);
		  @Nullable
		String block = bodyToMono.block();
		System.out.println(block);
	 }
	 
	 //syncronijation call to object
	 public void getProductJsonObject(Integer id) {
		     WebClient webClient = WebClient.create();
		     Mono<Product> bodyToMono = webClient.get()
		               			                 .uri(url,id)
		               		                     .retrieve()
		               		                     .bodyToMono(Product.class);
		             @Nullable
					Product block = bodyToMono.block();
		            System.out.print(block);	               
	 }
	 
	 //asynchronus communication 
	 public void  getProductAsync(Integer id) {
		   WebClient webClient = WebClient.create();
		             webClient.get()
		             		  .uri(url,id)
		             		  .retrieve()
		             		  .bodyToMono(Product.class)
		             		  .subscribe(response->{
		             			 handleAsyncProduct(response);
		             		  });
		             
		  System.out.println("Request sending is complete...........");
	 }
	 
	 //subscribe 
	 public void handleAsyncProduct(Product p) {
		  System.out.println(p);
	 }
}
