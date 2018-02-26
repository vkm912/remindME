package com.remindme.restweb.services;

import java.util.List;

import com.remindme.restweb.model.Notification;

public interface RemindMeNotificationService {

	boolean removeNotification(int id);
	Notification getNotificationDtl(int id);
	List<Notification> getAllUserNotifications(int userId);
}
