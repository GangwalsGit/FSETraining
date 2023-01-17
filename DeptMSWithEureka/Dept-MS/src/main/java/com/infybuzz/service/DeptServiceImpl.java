package com.infybuzz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.infybuzz.entity.Dept;
import com.infybuzz.feignclients.StudentFeignClient;
import com.infybuzz.repository.DeptRepository;
import com.infybuzz.request.CreateDeptRequest;
import com.infybuzz.response.DeptResponse;


@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	DeptRepository deptRepository;
	
	@Autowired
	WebClient webClient;
	
	@Autowired
	StudentFeignClient studentFeignClient;	
	

	@Override
	public DeptResponse createDept(CreateDeptRequest createDeptRequest) {
		Dept dept = new Dept();
		dept.setDeptName(createDeptRequest.getDeptName());
		dept.setDeptHodName(createDeptRequest.getDeptHodName());
		dept.setStudentId(createDeptRequest.getStudentId());

		dept = deptRepository.save(dept);
		
		DeptResponse deptResponse = new DeptResponse(dept);
		
		deptResponse.setStudentResponse(studentFeignClient.getById(dept.getStudentId()));

		return deptResponse;
	}

	@Override
	public DeptResponse getById(long id) {
		Dept dept = deptRepository.findById(id).get();
		DeptResponse deptResponse = new DeptResponse(dept);
	
		deptResponse.setStudentResponse(studentFeignClient.getById(dept.getStudentId()));
		
		return deptResponse;
	}
	

}
