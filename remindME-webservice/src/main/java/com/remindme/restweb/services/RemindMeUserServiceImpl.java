package com.remindme.restweb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.remindme.restweb.model.User;
import com.remindme.restweb.repository.UserDao;

@Service
public class RemindMeUserServiceImpl implements RemindMeUserService {
	
	List<User> users = new ArrayList<>();
	@Autowired
	private UserDao userDao;

	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		if(user!=null) {
			userDao.registerUser(user);
			return true;
		} /*else {
			StarUser user1 = new StarUser();
			//No need to setup the id here as it is an auto generated value. 
			//In case if you do this by mistake you would get 
			//org.hibernate.PersistentObjectException: detached entity passed to 
			//persist: com.remindme.restweb.model.StarUser exception.
			//user1.setId(1);
			user1.setFirstName("VIVEK");
			user1.setLastName("MISHRA");
			user1.setEmailId("vivek.mishrajbp@gmail");
			StarUser user2 = new StarUser();
			user2.setFirstName("VIVEK2");
			user2.setLastName("MISHRA2");
			user2.setEmailId("vivekkmishra912@gmail");
			StarUser user3 = new StarUser();
			user3.setFirstName("VIVEK3");
			user3.setLastName("MISHRA3");
			user3.setEmailId("vivek.mishrajbp@gmail");
			users.add(user1);
			users.add(user2);
			users.add(user3);
			userDao.createUser(user1);
		}*/
		return true;
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserDetails(String emailId) {
		/*List<StarUser> details= new ArrayList<>();
		users.forEach(user->{
			if(user.getEmailId().equals(emailId))
				details.add(user);
		});*/
		return userDao.getUserDetails(emailId);
	}

}
