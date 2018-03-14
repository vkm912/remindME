package com.remindme.restweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remindme.restweb.model.User;
import com.remindme.restweb.services.RemindMeUserServiceImpl;

@RestController
@RequestMapping("/remindME-webservice/user")
public class RemindMeUserController {
	
	@Autowired
	RemindMeUserServiceImpl service;
	
	@PostMapping(path="/add", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean subscribe(@RequestBody User user) {
		return service.registerUser(user);
	}
	
	@GetMapping("/get/{emailId}")
	public User getAllUsers(@PathVariable String emailId){
		return service.getUserDetails(emailId);
	}
	
	@GetMapping("/remove/{emailId}")
	public boolean removeUsers(@PathVariable String emailId){
		return service.removeUser(emailId);
	}
	
	@PostMapping(path="/modify", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean modifyUser(@RequestBody User user){
		return service.modifyUser(user);
	}

}
