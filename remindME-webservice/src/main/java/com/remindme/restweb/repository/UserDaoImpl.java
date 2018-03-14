package com.remindme.restweb.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		//Session session = null;
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
	public boolean modifyUser(User user) {
		User actualUser = getUserDetails(user.getPrimaryEmailId());
		actualUser.setFirstName(user.getFirstName());
		actualUser.setLastName(user.getLastName());
		actualUser.setPrimaryEmailId(user.getPrimaryEmailId());
		actualUser.setEmailIds(user.getEmailIds());
		return true;
	}
	
	@Override
	public User getUserDetails(String emailId) {
		User user =(User) entityManager.createNamedQuery("User.findByEmailId", User.class).setParameter(1, emailId).getSingleResult();
		if(user!=null) {
			return user;
		}
		return null;
	}

	@Override
	public boolean removeUser(String emailId) {
		/*int usersDeleted = entityManager.createNamedQuery("User.removeByEmailId").setParameter(1, emailId).executeUpdate();
		if(usersDeleted==1) {
			return true;
		}
		return false;*/
		User user = getUserDetails(emailId);
		entityManager.remove(user);
		return true;
	}
}
