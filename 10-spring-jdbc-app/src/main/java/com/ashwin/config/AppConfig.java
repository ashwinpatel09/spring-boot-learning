package com.ashwin.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.ashwin")
public class AppConfig {
     
	@Bean
	public DataSource createDS() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sbs75");
		ds.setUsername("root");
		ds.setPassword("root");		
		return ds;
	}
	
	@Bean
	public JdbcTemplate creteJt(DataSource ds) {
		return new JdbcTemplate(ds);
	}
}
