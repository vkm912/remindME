package com.remindme.restweb.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.remindme.restweb.model.StarUser;

@Transactional
@Repository
public class StarUserDaoImpl implements StarUserDao{
	@Autowired
	SessionFactory sessionFactory;
	@PersistenceContext
	EntityManager entityManager;
	
	public boolean createUser(StarUser user) {
		Session session = null;
		try {
			/*session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();*/
			entityManager.clear();
			entityManager.persist(user);
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
	public List<StarUser> getUserDetails(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}
}
