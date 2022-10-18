package com.natwest.learning.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.natwest.learning.model.User;
@Component
@Transactional
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;

    @Autowired
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// Add User
	public boolean addUser(User user) {
        Session session=sessionFactory.getCurrentSession();
        session.save(user);
        return true;
	}
	
	// Delete User
		public boolean deleteUser(String email) {
			sessionFactory.getCurrentSession().delete(getUserByEmail(email));
			return true;
		}
		
		
		// update user
		public boolean updateUser(User user) {
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		  
     
	// List of all Users
	public List<User> listAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}
	
    // Get User by Eamil
	public User getUserByEmail(String email) {
		return (User) sessionFactory.getCurrentSession().createQuery("from User where email='"+email+"'").uniqueResult();
	}
   
}
