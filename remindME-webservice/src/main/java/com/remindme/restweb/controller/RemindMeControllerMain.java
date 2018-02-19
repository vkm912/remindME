package com.remindme.restweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remindme.restweb.model.User;
import com.remindme.restweb.services.RemindMeServiceImpl;

@RestController
@RequestMapping("/remindME-webservice/user")
public class RemindMeControllerMain {
	@Autowired
	RemindMeServiceImpl service;
	
	
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
	public List<User> getAllUsers(@PathVariable String emailId){
		return service.getUserDetails(emailId);
	}
	
	@RequestMapping("/removenot/{id}")
	public boolean removeNotification(@PathVariable int id) {
		return service.removeNotification(id);
	}
}
