package com.remindme.restweb.services;

import java.util.List;

import com.remindme.restweb.model.StarUser;

public interface RemindMeService {
	boolean registerUser(StarUser user);
	boolean modifyUser(StarUser user);
	boolean removeUser(StarUser user);
	boolean removeNotification(StarUser user);
	List<StarUser> getUserDetails(String emailId);
}
