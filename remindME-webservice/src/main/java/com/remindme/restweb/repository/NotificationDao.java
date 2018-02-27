package com.remindme.restweb.repository;

import java.util.List;
import com.remindme.restweb.model.Notification;

public interface NotificationDao {
	
	boolean removeNotification(int id); 
	Notification getNotificationDtl(int id);
	List<Notification> getAllUserNotifications(int userId);
	boolean addNotification(Notification notification);
	boolean removeAllUserNotifications(int userId);
	boolean modifyNotification(Notification notification);
}
