package com.capstone.wecare.coach.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class CreateCoachRequest {


    private String name;

    private String password;

    private LocalDate dateOfBirth;

    private String gender;

    private String mobileNumber;


    private String speciality;


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
}
