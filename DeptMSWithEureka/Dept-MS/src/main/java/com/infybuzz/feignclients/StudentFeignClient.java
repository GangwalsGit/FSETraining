package com.infybuzz.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.infybuzz.response.StudentResponse;

@FeignClient(url = "${student.service.url}", value = "student-feign-client",
path = "/api/student")
public interface StudentFeignClient {
	
	@GetMapping("/getById/{id}")
	public StudentResponse getById(@PathVariable long id);


}
