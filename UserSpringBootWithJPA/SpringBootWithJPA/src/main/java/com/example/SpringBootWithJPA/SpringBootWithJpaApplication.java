package com.example.SpringBootWithJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJpaApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {

	    return new WebMvcConfigurer() {

	        @Override
	        public void addCorsMappings(CorsRegistry corsRegistry) {
	            corsRegistry.addMapping("/api/adduser").allowedOrigins("http://localhost:3001");
	        }
	    };
	}

}
