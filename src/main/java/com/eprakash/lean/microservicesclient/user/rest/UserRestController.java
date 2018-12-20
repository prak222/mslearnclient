package com.eprakash.lean.microservicesclient.user.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eprakash.lean.microservicesclient.user.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List getUsers()
	{
		return userService.getUsers();
	}
	
	

}
