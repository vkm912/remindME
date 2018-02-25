package com.remindme.restweb.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.remindme.restweb.model.User;

public interface UserDao {
	
    boolean registerUser(User user);
    boolean modifyUser(User user);
    User getUserDetails(String emailId);
    boolean removeUser(String emailId);
    
}
