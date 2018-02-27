package com.remindme.restweb.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.remindme.restweb.model.Notification;
import com.remindme.restweb.model.User;

@Repository
@Transactional
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
		try {
			Notification notification = entityManager.find(Notification.class, id);
			return notification;		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Notification> getAllUserNotifications(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNotification(Notification notification) {
		try {
			entityManager.persist(notification);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeAllUserNotifications(int userId) {
		try{
			int rows = entityManager.createNamedQuery("Notification.removeByUserId").setParameter(1, userId).executeUpdate();
			System.out.println("***************** Number of rows deleted : "+rows+"*********************");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modifyNotification(Notification notification) {
		try {
			Notification actualNotification = getNotificationDtl(notification.getId());
			actualNotification.setMessage(notification.getMessage());
			actualNotification.setEmailId(notification.getEmailId());
			actualNotification.setIteration(notification.getIteration());
			actualNotification.setStatus(notification.getStatus());
			actualNotification.setStartTime(notification.getStartTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
