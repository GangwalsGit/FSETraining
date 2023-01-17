package com.infybuzz.service;

import org.springframework.stereotype.Service;

import com.infybuzz.request.CreateDeptRequest;
import com.infybuzz.response.DeptResponse;

public interface DeptService {

	DeptResponse createDept(CreateDeptRequest createDeptRequest);

	DeptResponse getById(long id);

}
