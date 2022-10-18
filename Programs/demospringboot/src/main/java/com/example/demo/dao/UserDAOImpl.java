package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{
	
	private List<User> users;

	public UserDAOImpl(List<User> users) {
		users=new ArrayList<User>();
	}
	
	
	
	
	

}
