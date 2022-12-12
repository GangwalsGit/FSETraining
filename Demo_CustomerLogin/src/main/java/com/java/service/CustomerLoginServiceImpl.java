package com.java.service;

import org.springframework.stereotype.Service;

import com.java.dto.CustomerLoginDTO;
import com.java.exception.InfyBankException;
import com.java.repository.CustomerLoginRepository;
import com.java.repository.CustomerLoginRepositoryImpl;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService {

	private CustomerLoginRepository customerLoginRepository;

	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException {
		String toReturn = null;
		customerLoginRepository = new CustomerLoginRepositoryImpl();
		CustomerLoginDTO customerLoginFromRepository = 
				customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		if (customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toReturn = "SUCCESS";
		} else {
			throw new InfyBankException("Service.WRONG_CREDENTIALS");
		}
		return toReturn;
	}
}