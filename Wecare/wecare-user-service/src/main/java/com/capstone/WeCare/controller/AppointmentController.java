package com.capstone.WeCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.WeCare.entity.Appointment;
import com.capstone.WeCare.entity.User;
import com.capstone.WeCare.exception.UserException;
import com.capstone.WeCare.request.CreateUserAppointmentRequest;
import com.capstone.WeCare.service.AppointmentService;


@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/create")
	public Long createAppointment (@RequestBody CreateUserAppointmentRequest createUserAppointmentRequest ) {
		return appointmentService.createAppointment(createUserAppointmentRequest);
	}	
	
    @DeleteMapping("/{id}")
    public void cancelAppointment(@PathVariable Long id){
    	appointmentService.cancelAppointment(id);

    }
    
	@GetMapping("/getAppointments/{id}")
	public List<Appointment> getAppointmentByUserId(@PathVariable long id)  {
		return appointmentService.getAppointmentByUserId(id);
	}

}
