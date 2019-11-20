package com.ibm.rest.webservices.restwebservices.register;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class UserService {

	private static List<User> users = new ArrayList();
	private static int idCounter=1;
	public User save(User user) {
		
		// Lookup user in database by e-mail
				User userExists = findByEmailId(user.getEmailId());
				
				System.out.println(userExists);
				
				if (userExists != null) {
					System.out.println("Oops!  There is already a user registered with the email provided.");
					return null;
				}
				else
					users.add(user);
		
		return user;
	}
	public User findByEmailId(String id) {
		// TODO Auto-generated method stub
		for(User user:users)
		{
			if(user.getEmailId().equalsIgnoreCase(id))
			{
				return user;
			}
		}
		return null;
	}
	public User findByUser(List<User> userList,String emailId, String password)
	{
		for(User user:userList)
		{
			if(user.getEmailId().equalsIgnoreCase(emailId) && user.getPassword().equalsIgnoreCase(password))
			{
				return user;
			}
		}
		return null;
		
	}

}
