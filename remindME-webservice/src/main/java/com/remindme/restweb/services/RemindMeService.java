package com.remindme.restweb.services;

import java.util.List;

import com.remindme.restweb.model.User;

public interface RemindMeService {
	boolean registerUser(User user);
	boolean modifyUser(User user);
	boolean removeUser(User user);
	boolean removeNotification(int id);
	List<User> getUserDetails(String emailId);
}
