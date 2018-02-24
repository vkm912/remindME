package com.remindme.restweb.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.remindme.restweb.model.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
	@PersistenceContext
	EntityManager entityManager;
	
	public boolean registerUser(User user) {
		Session session = null;
		try {
			/*session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();*/
			entityManager.clear();
			entityManager.persist(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean deleteUser(String emailId) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public User getUserDetails(String emailId) {
		User user =(User) entityManager.createNamedQuery("User.byEmailId", User.class).setParameter(1, emailId).getSingleResult();
		if(user!=null) {
			return user;
		}
		return null;
	}
}
