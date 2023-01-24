package com.capstone.wecare.coach.request;

public class CreateLoginRequest {
	
	private Long coachId;

	private String password;
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCoachId() {
		return coachId;
	}

	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}
}
