package com.infybuzz.response;

import com.infybuzz.entity.Dept;

public class DeptResponse {

	private long id;
	
	private String deptName;

	private String deptHodName;

	private StudentResponse studentResponse;
	
	public DeptResponse(Dept dept) {
		this.id = dept.getId();
		this.deptName = dept.getDeptName();
		this.deptHodName = dept.getDeptHodName();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptHodName() {
		return deptHodName;
	}

	public void setDeptHodName(String deptHodName) {
		this.deptHodName = deptHodName;
	}

	public StudentResponse getStudentResponse() {
		return studentResponse;
	}

	public void setStudentResponse(StudentResponse studentResponse) {
		this.studentResponse = studentResponse;
	}


}
