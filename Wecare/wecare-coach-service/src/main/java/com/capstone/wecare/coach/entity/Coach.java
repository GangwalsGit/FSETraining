package com.capstone.wecare.coach.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.capstone.wecare.coach.request.CreateCoachRequest;



@Entity
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

 

    @NotBlank
    @Size(min = 5, max = 10)
    private String password;

 

    public Coach() {
    }

 

    @NotNull
    @Past
    private LocalDate dateOfBirth;

 

    @NotBlank
    private String gender;

 

    @NotBlank
    @Size(min = 10, max = 10)
    private String mobileNumber;

 

    @NotBlank
    @Size(min = 10, max = 50)
    private String speciality;

 

    public Long getId() {
        return id;
    }

 

    public void setId(Long id) {
        this.id = id;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public String getPassword() {
        return password;
    }

 

    public void setPassword(String password) {
        this.password = password;
    }

 

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

 

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

 

    public String getGender() {
        return gender;
    }

 

    public void setGender(String gender) {
        this.gender = gender;
    }

 

    public String getMobileNumber() {
        return mobileNumber;
    }

 

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

 

    public String getSpeciality() {
        return speciality;
    }

 

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    public Coach(Long id, @NotBlank @Size(min = 3, max = 50) String name,
            @NotBlank @Size(min = 5, max = 10) String password, @NotNull @Past LocalDate dateOfBirth,
            @NotBlank String gender, @NotBlank @Size(min = 10, max = 10) String mobileNumber,
            @NotBlank @Size(min = 10, max = 50) String speciality) {
      
        this.id = id;
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.speciality = speciality;
    }



	public Coach(CreateCoachRequest coachResponse) {
		this.name = coachResponse.getName();
		this.password = coachResponse.getPassword();
		this.dateOfBirth = coachResponse.getDateOfBirth();
		this.gender = coachResponse.getGender();
		this.mobileNumber = coachResponse.getMobileNumber();
		this.speciality = coachResponse.getSpeciality();
	}
}
