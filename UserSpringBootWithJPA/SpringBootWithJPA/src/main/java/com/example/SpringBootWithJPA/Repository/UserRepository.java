package com.example.SpringBootWithJPA.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootWithJPA.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
