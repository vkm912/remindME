package com.remindme.restweb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.remindme.restweb.model.StarUser;
import com.remindme.restweb.repository.StarUserDao;

@Service
public class RemindMeServiceImpl implements RemindMeService {
	
	List<StarUser> users = new ArrayList<>();
	@Autowired
	private StarUserDao userDao;

	@Override
	public boolean registerUser(StarUser user) {
		// TODO Auto-generated method stub
		if(user!=null) {
			users.add(user);
			return true;
		} else {
			StarUser user1 = new StarUser();
			user1.setId(1);
			user1.setFirstName("VIVEK");
			user1.setLastName("MISHRA");
			user1.setEmailId("vivek.mishrajbp@gmail");
			StarUser user2 = new StarUser();
			user2.setId(2);
			user2.setFirstName("VIVEK2");
			user2.setLastName("MISHRA2");
			user2.setEmailId("vivekkmishra912@gmail");
			StarUser user3 = new StarUser();
			user3.setId(3);
			user3.setFirstName("VIVEK3");
			user3.setLastName("MISHRA3");
			user3.setEmailId("vivek.mishrajbp@gmail");
			users.add(user1);
			users.add(user2);
			users.add(user3);
			userDao.createUser(user1);
			userDao.createUser(user2);
			userDao.createUser(user3);
		}
		return true;
	}

	@Override
	public boolean modifyUser(StarUser user) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean removeUser(StarUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StarUser> getUserDetails(String emailId) {
		List<StarUser> details= new ArrayList<>();
		users.forEach(user->{
			if(user.getEmailId().equals(emailId))
				details.add(user);
		});
		return details;
	}

}
