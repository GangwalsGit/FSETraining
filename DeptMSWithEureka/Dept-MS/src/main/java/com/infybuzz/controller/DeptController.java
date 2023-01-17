package com.infybuzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infybuzz.request.CreateDeptRequest;
import com.infybuzz.response.DeptResponse;
import com.infybuzz.service.DeptService;


@RestController
@RequestMapping("/api/dept")
public class DeptController {
	@Autowired
	DeptService deptService;
	
	@PostMapping("/create")
	public DeptResponse createDept (@RequestBody CreateDeptRequest createDeptRequest) {
		return deptService.createDept(createDeptRequest);
	}
	
	@GetMapping("/getById/{id}")
	public DeptResponse getById (@PathVariable long id) {
		return deptService.getById(id);
	}

}
