package com.capstone.WeCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.WeCare.entity.Appointment;
import com.capstone.WeCare.repository.AppointmentRepository;
import com.capstone.WeCare.request.CreateUserAppointmentRequest;

public class AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	public Long createAppointment(CreateUserAppointmentRequest createUserAppointmentRequest) {
		
        Appointment appointment = new Appointment(createUserAppointmentRequest);
        return appointmentRepository.save(appointment).getBookingId();		

	}
	
	public void cancelAppointment(Long bookingId) {		
		appointmentRepository.deleteById(bookingId);	
	}

	public List<Appointment> getAppointmentByUserId(long UserId) {
		List<Appointment> appointmentList = appointmentRepository.findByUserId(UserId);
		return appointmentList;
	}


}
