package com.example.SpringBootWithJPA.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootWithJPA.DTO.UserDTO;
import com.example.SpringBootWithJPA.Entity.User;
import com.example.SpringBootWithJPA.Exception.UserException;
import com.example.SpringBootWithJPA.Repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public String addUser(UserDTO user) {
		User userEntity = new User();
		userEntity.setName(user.getName());
		userEntity.setUsername(user.getUsername());
		userEntity.setEmail(user.getEmail());
		userEntity.setPhone(user.getPhone());
		userEntity.setWebsite(user.getWebsite());
		User customerEntity2 = userRepository.save(userEntity);
		return customerEntity2.getName();
	}
	@Override
	public void deleteUserById(Integer userId) throws UserException{
		Optional<User> user = userRepository.findById(userId);
		user.orElseThrow(() -> new UserException("User not Found"));
		userRepository.deleteById(userId);
	}
	@Override
	public UserDTO getUserByUserId(Integer userId) throws UserException {
		Optional<User> optional = userRepository.findById(userId);
		User user = optional.orElseThrow(() -> new UserException("User not Found"));
		UserDTO user2 = new UserDTO();
		user2.setName(user.getName());
		user2.setUsername(user.getUsername());
		user2.setEmail(user.getEmail());
		user2.setPhone(user.getPhone());
		user2.setWebsite(user.getWebsite());
		return user2;
	}
	@Override
	public void updateUserById(Integer userId, UserDTO user) throws UserException {
		Optional<User> userDbOp = userRepository.findById(userId);
		User user2 = userDbOp.orElseThrow(() -> new UserException("Service.CUSTOMER_NOT_FOUND"));
		user2.setName(user.getName());
		user2.setEmail(user.getEmail());
		user2.setPhone(user.getPhone());
		user2.setWebsite(user.getWebsite());
		user2.setUsername(user.getUsername());
        userRepository.save(user2);	
	}	

}
