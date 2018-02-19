package com.remindme.restweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/remindME-webservice/notifications")
public class RemindMeControllerNotification {
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "Hi!";
	}
}
