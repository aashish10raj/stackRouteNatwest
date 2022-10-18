package com.learning.natwest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.natwest.dao.EventDAO;
import com.learning.natwest.model.Event;

@RestController // @Controller + @ResponseBody
public class EventController {
	
	ResponseEntity<?> response;
	@Autowired
	EventDAO dao;
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello ! Rest API";
	}
	@PostMapping("/addEvent")
	public ResponseEntity<?> addEvent(@RequestBody Event event){
		boolean flag=dao.addEvent(event);
		
		if(flag) {
			response=new ResponseEntity<Event>(event, HttpStatus.CREATED);
		}else {
			response=new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@GetMapping("/events")
	public ResponseEntity<?> getEvents(){
		List<Event> eventList=dao.getAllEvents();
		
		if(eventList !=null) {
			response=new ResponseEntity<List>(eventList, HttpStatus.OK);
		}else {
			response=new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@GetMapping("/event/{eventId}")
	public ResponseEntity<?> getEvents(@PathVariable int eventId){
		Event event=dao.getEventById(eventId);
		
		if(event !=null) {
			response=new ResponseEntity<Event>(event, HttpStatus.OK);
		}else {
			response=new ResponseEntity<String>("Failure", HttpStatus.CONFLICT);
		}
		return response;
	}

}
