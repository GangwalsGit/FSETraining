package com.capstone.wecare.coach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capstone.wecare.coach.entity.Coach;
@Repository
public interface CoachRepository extends JpaRepository<Coach,Long>{

}
