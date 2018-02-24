package com.remindme.restweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remindme.restweb.services.RemindMeNotificationService;

@RestController
@RequestMapping(value="/remindME-webservice/notifications")
public class RemindMeNotificationController {
	
	@Autowired
	RemindMeNotificationService service;
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "Hi!";
	}
	
	@RequestMapping("/removenot/{id}")
	public boolean removeNotification(@PathVariable int id) {
		return service.removeNotification(id);
	}
}
