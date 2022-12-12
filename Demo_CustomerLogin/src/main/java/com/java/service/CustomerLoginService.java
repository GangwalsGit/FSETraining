package com.java.service;

import com.java.dto.CustomerLoginDTO;
import com.java.exception.InfyBankException;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException;
}
