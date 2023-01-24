package com.capstone.WeCare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capstone.WeCare.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{

	List<Appointment> findByUserId(long userId);

}
