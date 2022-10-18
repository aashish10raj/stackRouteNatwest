package com.learning.natwest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	@GeneratedValue
	private int eventId;
	private String name;
	private String location;
	
	public Event() {
	}

	public Event(int eventId, String name, String location) {
		this.eventId = eventId;
		this.name = name;
		this.location = location;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", name=" + name + ", location=" + location + "]";
	}	

}
