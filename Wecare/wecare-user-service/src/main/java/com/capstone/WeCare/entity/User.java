package com.capstone.WeCare.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.capstone.WeCare.request.CreateUserRequest;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "password")
	private String password;

	@Column(name = "name")
	private String name;
	
	@Column(name = "phone")
	private Long phone;

	@Column(name = "email")
	private String email;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private String pincode;

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "dob")
	private LocalDate dob;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

    public User() {
    }
	public User(CreateUserRequest createUserRequest) {

		this.password = createUserRequest.getPassword();
		this.name = createUserRequest.getName();
		this.phone = createUserRequest.getPhone();
		this.email = createUserRequest.getEmail();
		this.city = createUserRequest.getCity();
		this.pincode = createUserRequest.getPincode();
		this.gender = createUserRequest.getGender();
		this.state = createUserRequest.getState();
		this.country = createUserRequest.getCountry();
		this.dob = createUserRequest.getDob();
	}

	public User(Long id, String password, String name, Long phone, String email, String city, String pincode,
			String gender, String state, String country, LocalDate dob) {
	
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.city = city;
		this.pincode = pincode;
		this.gender = gender;
		this.state = state;
		this.country = country;
		this.dob = dob;
	}
}
