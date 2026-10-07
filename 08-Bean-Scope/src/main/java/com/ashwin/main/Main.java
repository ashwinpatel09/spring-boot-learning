package com.ashwin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashwin.beans.Motor;
import com.ashwin.config.MyApp;

public class Main {
        public static void main(String[] args) {
			ApplicationContext ctxt = new AnnotationConfigApplicationContext(MyApp.class);
            
//			ConfigurableApplicationContext c = (ConfigurableApplicationContext) ctxt;
//			c.close();
            Motor m1 = ctxt.getBean(Motor.class);
            System.out.println(m1.hashCode());
            
            Motor m2 = ctxt.getBean(Motor.class);
            System.out.println(m2.hashCode());
		}
}
