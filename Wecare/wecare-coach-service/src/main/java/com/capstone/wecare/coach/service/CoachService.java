package com.capstone.wecare.coach.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.wecare.coach.entity.Coach;
import com.capstone.wecare.coach.exception.CoachException;
import com.capstone.wecare.coach.repository.CoachRepository;
import com.capstone.wecare.coach.request.CreateCoachRequest;
import com.capstone.wecare.coach.request.CreateLoginRequest;

@Service
public class CoachService {
	
	@Autowired
	CoachRepository coachRepository;

	public Coach createCoach(CreateCoachRequest createCoachRequest) {
        Coach coach = new Coach(createCoachRequest);
        return coachRepository.save(coach);
	}

    public List<Coach> getAllCoach() {
        return coachRepository.findAll();
    }

	public String coachLogin(CreateLoginRequest createLoginRequest) throws CoachException {
		Optional<Coach> coachDbOp = coachRepository.findById(createLoginRequest.getCoachId());
		Coach coach = coachDbOp.orElseThrow(() -> new CoachException("Service.COACH_NOT_FOUND"));
			if(coach.getId()==createLoginRequest.getCoachId() 
				&& coach.getPassword().equalsIgnoreCase(createLoginRequest.getPassword()))
			{
				return "Success";
			}
			else
			{
				throw new CoachException("Service.PASSWORD_IS_INCORRECT");
			}			
	}

}
