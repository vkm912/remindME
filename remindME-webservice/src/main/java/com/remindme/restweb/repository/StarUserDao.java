package com.remindme.restweb.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.remindme.restweb.model.StarUser;

@Repository
public class StarUserDao {
	@Autowired
	SessionFactory sessionFactory;
	public boolean createUser(StarUser user) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
