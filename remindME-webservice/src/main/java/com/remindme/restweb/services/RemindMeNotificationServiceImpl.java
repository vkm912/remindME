package com.remindme.restweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.remindme.restweb.model.Notification;
import com.remindme.restweb.repository.NotificationDao;

@Service
public class RemindMeNotificationServiceImpl implements RemindMeNotificationService {

	@Autowired
	NotificationDao notificationDao;
	
	@Override
	public boolean removeNotification(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Notification getNotificationDtl(int id) {
		return notificationDao.getNotificationDtl(id);
	}

	@Override
	public List<Notification> getAllUserNotifications(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNotification(Notification notification) {
		return notificationDao.addNotification(notification);
	}

}
