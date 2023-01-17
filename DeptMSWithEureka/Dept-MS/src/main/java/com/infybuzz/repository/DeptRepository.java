package com.infybuzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infybuzz.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {

}
