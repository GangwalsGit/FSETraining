package com.capstone.WeCare.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.capstone.WeCare.request.CreateUserAppointmentRequest;
@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long bookingId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "date")
	private LocalDate dateOfAppointment;
	
	@Column(name = "slot")
	private Long slot;	
	
	@Column(name = "coach_id")
	private Long coachId;
	
	public Appointment(CreateUserAppointmentRequest createUserAppointmentRequest) {
		this.userId = createUserAppointmentRequest.getUserId();
		this.dateOfAppointment = createUserAppointmentRequest.getDateOfAppointment();
		this.slot = createUserAppointmentRequest.getSlot();
		this.coachId = createUserAppointmentRequest.getCoachId();
	}
	
	public Appointment()
	{}
	
	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDate getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(LocalDate dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public Long getSlot() {
		return slot;
	}

	public void setSlot(Long slot) {
		this.slot = slot;
	}

	public Appointment(Long bookingId, Long userId, LocalDate dateOfAppointment, Long slot, Long coachId) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.dateOfAppointment = dateOfAppointment;
		this.slot = slot;
		this.coachId = coachId;
	}
}
