package com.remindme.restweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/removeNotification/{id}")
	public boolean removeNotification(@PathVariable int id) {
		return service.removeNotification(id);
	}
	
	@GetMapping("/get/{id}")
	public Notification getNotificationDtl(@PathVariable int id) {
		return service.getNotificationDtl(id);
	}
	
	@PostMapping(path="/add", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addNotification(@RequestBody Notification notification) {
		return service.addNotification(notification);
	}
	
	@GetMapping("/removeAllNotifications/{userId}")
	public boolean removeAllUserNotifications(@PathVariable int userId) {
		return service.removeAllUserNotifications(userId);
	}
	
	@PostMapping(path="/modifyNotification", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean modifyNotification(@RequestBody Notification notification) {
		return service.modifyNotification(notification);
	}
}
