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
	
	public boolean createUser(User user) {
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
	public int updateUser(String emailId) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteUser(String emailId) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<User> getUserDetails(String emailId) {
		String hql = "FROM StarUser as su WHERE su.emailId=?";
		List<User> users =entityManager.createQuery(hql).setParameter(1, emailId).getResultList();
		if(users!=null && !users.isEmpty()) {
			return users;
		}
		return null;
	}
	@Override
	public boolean removeNotification(int id) {
		User notification = getNotificationDtl(id);
		if(notification!=null) {
			entityManager.remove(notification);
			return true;
		}
		return false;
	}
	@Override
	public User getNotificationDtl(int id) {
		return entityManager.find(User.class, id);
	}
}
