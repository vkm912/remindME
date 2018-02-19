package com.remindme.restweb.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.remindme.restweb.model.User;

public interface StarUserDao {
	
    boolean createUser(User user);
    int updateUser(String emailId);
    int deleteUser(String emailId);
    boolean removeNotification(int id);
    List<User> getUserDetails(String emailId);
    User getNotificationDtl(int id);
}
