package com.java.config;

import org.springframework.context.annotation.Configuration;

import com.java.controller.CustomerLoginController;
import com.java.repository.CustomerLoginRepository;
import com.java.repository.CustomerLoginRepositoryImpl;
import com.java.service.CustomerLoginService;
import com.java.service.CustomerLoginServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "com.java.controller com.java.exception com.java.repository com.java.service")
public class JavaConfig {
	
@Bean
public CustomerLoginController customerLoginController ()
{
	return new CustomerLoginController();
}

@Bean
public CustomerLoginService customerLoginService ()
{
	return new CustomerLoginServiceImpl();
}

@Bean
public CustomerLoginRepository customerLoginRepository ()
{
	return new CustomerLoginRepositoryImpl();
}

}
