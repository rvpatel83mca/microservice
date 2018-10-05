package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.to.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByFirstName(String name);
    
    
}