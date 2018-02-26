package com.remindme.restweb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.remindme.restweb.model.Notification;
import com.remindme.restweb.model.User;

@Repository
public class NotificationDaoImpl implements NotificationDao {
	
	@Autowired
	SessionFactory sessionFactory;
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public boolean removeNotification(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Notification getNotificationDtl(int id) {
		Notification notification = entityManager.find(Notification.class, id);
		return notification;
	}

	@Override
	public List<Notification> getAllUserNotifications(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
