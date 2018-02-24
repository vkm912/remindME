package com.remindme.restweb.services;

import java.util.List;

import com.remindme.restweb.model.User;

public interface RemindMeUserService {
	boolean registerUser(User user);
	boolean modifyUser(User user);
	boolean removeUser(User user);
	User getUserDetails(String emailId);
}
