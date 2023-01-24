package com.capstone.WeCare.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.WeCare.entity.User;
import com.capstone.WeCare.exception.UserException;
import com.capstone.WeCare.request.CreateLoginRequest;
import com.capstone.WeCare.request.CreateUserAppointmentRequest;
import com.capstone.WeCare.request.CreateUserRequest;
import com.capstone.WeCare.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/create")
	public Long createUser (@RequestBody CreateUserRequest createUserRequest ) {
		return userService.createUser(createUserRequest).getId();
	}
	
	@GetMapping("/getById/{id}")
	public User getById(@PathVariable long id) throws UserException {
		return userService.getById(id);
	}

	@GetMapping("/login")
	public String getById(@RequestBody CreateLoginRequest createLoginRequest) throws UserException {
		return userService.testLogin(createLoginRequest);
	}

}
