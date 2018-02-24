package com.remindme.restweb.repository;

import com.remindme.restweb.model.User;

public interface NotificationDao {
	
	boolean removeNotification(int id);
	User getNotificationDtl(int id);
}
