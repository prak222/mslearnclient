package com.eprakash.lean.microservicesclient.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	RestTemplate restTemplate;
	@Override
	public List getUsers() {
		// TODO Auto-generated method stub
		List userList=restTemplate.getForObject("http://localhost:8080/users", List.class);
		return userList;
	}
	
}
