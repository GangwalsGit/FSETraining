package com.capstone.WeCare.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.WeCare.entity.User;
import com.capstone.WeCare.exception.UserException;
import com.capstone.WeCare.repository.UserRepository;
import com.capstone.WeCare.request.CreateLoginRequest;
import com.capstone.WeCare.request.CreateUserAppointmentRequest;
import com.capstone.WeCare.request.CreateUserRequest;

@Service
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserRepository userRepository;

	public User createUser(CreateUserRequest createUserRequest) {
        User user = new User(createUserRequest);
        return userRepository.save(user);
	}

	public User getById(long id)throws UserException {
		Optional<User> userDbOp = userRepository.findById(id);
		User user = userDbOp.orElseThrow(() -> new UserException("Service.USER_NOT_FOUND"));		
		return user;
		
	}

	public String testLogin(CreateLoginRequest createLoginRequest) throws UserException {
		Optional<User> userDbOp = userRepository.findById(createLoginRequest.getUserId());
		User user = userDbOp.orElseThrow(() -> new UserException("Service.USER_NOT_FOUND"));
			if(user.getId()==createLoginRequest.getUserId() 
				&& user.getPassword().equalsIgnoreCase(createLoginRequest.getPassword()))
			{
				return "Success";
			}
			else
			{
				throw new UserException("Service.PASSWORD_IS_INCORRECT");
			}			
	}

	public String createAppointment(CreateUserAppointmentRequest createUserAppointmentRequest) {
return null;
	}
}
