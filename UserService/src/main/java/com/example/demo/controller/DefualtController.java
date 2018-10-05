package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.to.User;

@Controller
public class DefualtController {

	@GetMapping(value = "/")
	public String hello ()
	{
		return "Index";
	}
}
  