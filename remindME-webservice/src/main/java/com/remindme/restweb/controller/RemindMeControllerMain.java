package com.remindme.restweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remindme.restweb.model.StarUser;
import com.remindme.restweb.services.RemindMeServiceImpl;

@RestController
@RequestMapping("/remindME-webservice")
public class RemindMeControllerMain {
	@Autowired
	RemindMeServiceImpl service;
	
	@RequestMapping("/Hi")
	public Object sayHello() {
		return "Hello";
	}
	
	@RequestMapping("/Add")
	public boolean subscribe(@RequestBody StarUser user) {
		
		return service.registerUser(user);
		
	}
	
	@RequestMapping("/Get/{emailId}")
	public List<StarUser> getAllUsers(@PathVariable String emailId){
		return service.getUserDetails(emailId);
	}
	
	@RequestMapping("/Removenot/{id}")
	public boolean removeNotification(@PathVariable int id) {
		return service.removeNotification(id);
	}
}
