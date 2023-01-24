package com.capstone.wecare.coach.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@ComponentScan({"com.capstone.wecare.coach.controller", "com.capstone.wecare.coach.service"})
@EntityScan("com.capstone.wecare.coach.entity")
@EnableJpaRepositories("com.capstone.wecare.coach.repository")
@EnableEurekaClient
@CrossOrigin("http://localhost:3001")
public class WecareCoachServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WecareCoachServiceApplication.class, args);
	}
	

}
