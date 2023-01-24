package com.capstone.WeCare.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.capstone.WeCare.controller", "com.capstone.WeCare.service"})
@EntityScan("com.capstone.WeCare.entity")
@EnableJpaRepositories("com.capstone.WeCare.repository")
@EnableEurekaClient
public class WeCareUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeCareUserApplication.class, args);
	}

}
