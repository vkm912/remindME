package com.remindme.restweb.repository;

import com.remindme.restweb.model.User;

public interface UserDao {
	
    boolean registerUser(User user);
    boolean modifyUser(User user);
    User getUserDetails(String emailId);
    boolean removeUser(String emailId);
    
}
