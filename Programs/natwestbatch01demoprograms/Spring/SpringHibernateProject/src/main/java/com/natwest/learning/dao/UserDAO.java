package com.natwest.learning.dao;

import java.util.List;

import com.natwest.learning.model.User;

public interface UserDAO {
	
	public boolean addUser(User user);
	public List<User> listAllUsers();
	public User getUserByEmail(String email);
	public boolean deleteUser(String email);
	public boolean updateUser(User user);
	

}
