package com.remindme.restweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remindme.restweb.model.Notification;
import com.remindme.restweb.services.RemindMeNotificationService;

@RestController
@RequestMapping(value="/remindME-webservice/notification")
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
	
	@RequestMapping("/get/{id}")
	public Notification getNotificationDtl(@PathVariable int id) {
		return service.getNotificationDtl(id);
	}
	
	@RequestMapping("/add")
	public boolean addNotification(@RequestBody Notification notification) {
		return service.addNotification(notification);
	}
}
