package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("movie")
public class Movie {
	
	@Autowired
	@Qualifier("actor")
	private Actor actor;

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [actor=" + actor + "]";
	}

	public Movie(Actor actor) {
		super();
		this.actor = actor;
	}
	
	

}
