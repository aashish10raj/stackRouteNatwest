package com.learning.natwest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learning.natwest.model.Event;

@Repository // This class is going to interact with database
@Transactional
public class EventDAOImpl implements EventDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
	private List<Event> eventList;
	boolean flag;
	
	// Add Event
	public boolean addEvent(Event event) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(event);
			flag=true;
		}catch (Exception e) {
			flag=false;
		}
		return flag;
	}
    
	// Get All Events
	public List<Event> getAllEvents() {
		Query  query=sessionFactory.getCurrentSession().createQuery("from Event");
		return query.list();
	
	}
   // Get Event By ID
	public Event getEventById(int id) {
		List<Event> events=getAllEvents();
		for(Event event:events) {
			if(event.getEventId()==id)
				return event;
		}
		return null;
	}

	public String deleteEvent(int id) {
		Event event=getEventById(id);
		if(event !=null) {
			sessionFactory.getCurrentSession().delete(event);
			return "Event object Deleted";
		}
		return null;
	}

	public boolean updateEvent(Event eventObj) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(eventObj);
			flag=true;
		}catch (Exception e) {
		    flag=false;
		}
		return flag;
	}

}
