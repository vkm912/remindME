package com.remindme.restweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	/*Yet to find a way to forward the request from one controller to another
	@RequestMapping("/notification/{action}")
	public Object sayHello(@PathVariable String action) {
		return "forward:/remindME-webservice/notifications/"+action;
	}
	
	@RequestMapping("/notifications/{id}")
	public String sayHi() {
		return "Hi!";
	}*/
	
	@RequestMapping("/add")
	public boolean subscribe(@RequestBody User user) {
		return service.registerUser(user);
	}
	
	@RequestMapping("/get/{emailId}")
	public User getAllUsers(@PathVariable String emailId){
		return service.getUserDetails(emailId);
	}
	
	@RequestMapping("/remove/{emailId}")
	public boolean removeUsers(@PathVariable String emailId){
		return service.removeUser(emailId);
	}
	
	@RequestMapping("/modify")
	public boolean modifyUser(@RequestBody User user){
		return service.modifyUser(user);
	}

}
