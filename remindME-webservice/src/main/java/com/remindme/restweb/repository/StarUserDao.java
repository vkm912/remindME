package com.remindme.restweb.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.remindme.restweb.model.StarUser;

public interface StarUserDao {
	
    boolean createUser(StarUser user);
    int updateUser(String emailId);
    int deleteUser(String emailId);
    boolean removeNotification(int id);
    List<StarUser> getUserDetails(String emailId);
    StarUser getNotificationDtl(int id);
}
