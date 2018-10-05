package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.UserRepository;
import com.example.demo.to.User;

@RestController
public class UserController {
   
	@Autowired
	UserRepository u1 ;
	
	@GetMapping(value = "/hello")
	public String hello ()
	{
		return "JayShreeram";
	}
	@GetMapping(value = "/users1")
	public User getUsers1()
	{
		User u2 = new User();
		u2.setFirstName("Vipul");
		u2.setLastName("Patel");
		u2.setUserID(123);

		return u2;

	}

	
	@GetMapping(value = "/users")
	public Iterable<User> getUsers()
	{
		return u1.findAll();

	}
	
	@PostMapping(value = "/user")
	public void createUsers()
	{
		User u2 = new User();
		u2.setFirstName("Vipul");
		u2.setFirstName("Patel");
		u1.save(u2);

	}
	
}
