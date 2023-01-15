package com.example.SpringBootWithJPA.Service;

import com.example.SpringBootWithJPA.DTO.UserDTO;
import com.example.SpringBootWithJPA.Entity.User;
import com.example.SpringBootWithJPA.Exception.UserException;

public interface UserService {
	
	public String addUser(UserDTO user);

	public void deleteUserById(Integer userId) throws UserException;

	public UserDTO getUserByUserId(Integer userId) throws UserException;

	void updateUserById(Integer userId, UserDTO user) throws UserException;

}
