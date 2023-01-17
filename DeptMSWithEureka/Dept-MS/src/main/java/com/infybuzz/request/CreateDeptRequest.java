package com.infybuzz.request;

public class CreateDeptRequest {
	
	private String deptName;
	
	private String deptHodName;

	private Long studentId;

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

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}



}
