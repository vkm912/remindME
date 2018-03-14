package com.remindme.restweb.services;

import com.remindme.restweb.model.User;

public interface RemindMeUserService {
	boolean registerUser(User user);
	boolean modifyUser(User user);
	User getUserDetails(String emailId);
	boolean removeUser(String emailId);
}
