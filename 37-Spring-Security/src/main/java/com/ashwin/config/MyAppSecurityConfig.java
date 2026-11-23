package com.ashwin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyAppSecurityConfig {
	
	@Bean
	public PasswordEncoder pwdEncoder() {
		    return new BCryptPasswordEncoder();
	}
	
    @Bean   
	public InMemoryUserDetailsManager inMemoryConfig() {
		  
		UserDetails u1 = User.builder()
				              .username("ashwin")
				              .password(pwdEncoder().encode("ashwin@123"))
				              .roles("ADMIN")
				              .build();
		UserDetails u2 = User.builder()
				             .username("virat")
				             .password(pwdEncoder().encode("virat@123"))
				             .roles("MANAGER")
				             .build();
		UserDetails u3 = User.builder()
	                         .username("rohit")
	                         .password(pwdEncoder().encode("rohit@123"))
	                         .roles("STUDENT")
	                         .build();
		
		return new InMemoryUserDetailsManager(u1,u2,u3);
		
	}
    @Bean
    public SecurityFilterChain securityFilterConfig(HttpSecurity http) throws Exception {
    	   
    	http.authorizeHttpRequests(request -> 
    	     request.requestMatchers("/public/**").permitAll()
    	     .requestMatchers("/admin/**").hasRole("ADMIN")
    	     .requestMatchers("/manager/**").hasAnyRole("MANAGER","ADMIN")
    	     .requestMatchers("/student/**").hasRole("STUDENT")
    	     
    	     .anyRequest().authenticated())
    	     .httpBasic(Customizer.withDefaults())
    	     .formLogin(Customizer.withDefaults());
    			
    	return http.build();
    }
}

