package com.learning.natwest.dao;

import java.util.List;

import com.learning.natwest.model.Event;

public interface EventDAO {
	
	public boolean addEvent(Event event);
	public List<Event> getAllEvents();
	public Event getEventById(int id);
	public String deleteEvent(int id);
	public boolean updateEvent(Event eventObj); 
}
