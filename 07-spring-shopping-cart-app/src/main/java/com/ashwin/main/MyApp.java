package com.ashwin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashwin.config.AppConfig;
import com.ashwin.service.ShopingCart;

public class MyApp {
		public static void main(String[] args) {
			    ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		         ShopingCart st = ctxt.getBean(ShopingCart.class);
		         st.placeOrder();
		}
}
