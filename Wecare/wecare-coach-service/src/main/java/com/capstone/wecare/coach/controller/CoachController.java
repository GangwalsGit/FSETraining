package com.capstone.wecare.coach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capstone.wecare.coach.entity.Coach;
import com.capstone.wecare.coach.exception.CoachException;
import com.capstone.wecare.coach.request.CreateCoachRequest;
import com.capstone.wecare.coach.service.CoachService;
import com.capstone.wecare.coach.request.CreateLoginRequest;

@RestController
@RequestMapping("/api/coach")
@CrossOrigin("http://localhost:3001")
public class CoachController {
	
	@Autowired
	CoachService coachService;

	@PostMapping("/create")
	public ResponseEntity<Coach> createCoach (@RequestBody CreateCoachRequest createCoachRequest ) {
		Coach coach = coachService.createCoach(createCoachRequest);
		return new ResponseEntity<>(coach, HttpStatus.OK);
	}
	
	@GetMapping("/getAllCoach")
	public List<Coach> getAllCoach() {
		List<Coach> coachList= coachService.getAllCoach();
		return coachList;
	}
	
	@GetMapping("/login")
	public String coachLogin(@RequestBody CreateLoginRequest createLoginRequest) throws CoachException {
		return coachService.coachLogin(createLoginRequest);
	}

}
