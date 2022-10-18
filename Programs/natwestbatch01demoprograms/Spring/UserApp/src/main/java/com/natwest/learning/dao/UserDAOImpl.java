package com.natwest.learning.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.natwest.learning.model.User;
@Component
public class UserDAOImpl implements UserDAO {
	
	private List<User> users;

	public UserDAOImpl() {
		users=new ArrayList<User>();
	}
	
	// Add User
	public boolean addUser(User user) {
        return users.add(user);
	}
     
	// List of all Users
	public List<User> listAllUsers() {
		return users;
	}
	
    // Get User by Eamil
	public User getUserByEmail(String email) {
		Iterator itr=users.iterator();
		User user=null;
		while(itr.hasNext()) {
			user=(User) itr.next();
			if(email.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}
    
	// Delete User
	public boolean deleteUser(String email) {
		User existingUser=getUserByEmail(email);
		if(existingUser !=null) {
			users.remove(existingUser);
			return true;
		}
		return false;
	}
   
	// update user
	
	public boolean updateUser(User user) {
		User existingUser=getUserByEmail(user.getEmail());
		
		if(existingUser !=null) {
			existingUser.setName(user.getName());
			existingUser.setCity(user.getCity());
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	

}
