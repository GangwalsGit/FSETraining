package com.example.SpringBootWithJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootWithJPA.DTO.UserDTO;
import com.example.SpringBootWithJPA.Entity.User;
import com.example.SpringBootWithJPA.Exception.UserException;
import com.example.SpringBootWithJPA.Service.UserService;


@RestController
@RequestMapping(value = "/api")
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Environment environment;
	
	@PostMapping(value = "/adduser")
	public ResponseEntity<String> addCustomer(@RequestBody UserDTO user) 
	{
		String userName = userService.addUser(user);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + userName;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
	
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUserById(@PathVariable Integer userId)throws UserException {
        userService.deleteUserById(userId);
        String successMessage = environment.getProperty("API.DELETE_SUCCESS") ;
        return new ResponseEntity<>(successMessage, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer userId) throws UserException {
        UserDTO user = userService.getUserByUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUser(@RequestBody UserDTO user, @PathVariable Integer userId)throws UserException {
    	String successMessage = environment.getProperty("API.UPDATE_SUCCESS");
        return new ResponseEntity<String>(successMessage, HttpStatus.OK);
    }


}
