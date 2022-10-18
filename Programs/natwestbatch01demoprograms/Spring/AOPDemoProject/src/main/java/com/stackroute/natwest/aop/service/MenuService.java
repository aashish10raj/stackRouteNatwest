package com.stackroute.natwest.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MenuService {
	
	// Log
	// Security
	// Transaction
	
	
	public void breakfastMenuDetails() {
		System.out.println("*******************************Beakfast Menu Details::MenuService*****************************************");
		System.out.println("Idli/tMasala Dosa/tPanneer chilli/tPulav");
//		throw new NullPointerException();
	}
	
	public void lunchMenuDetails() {
	System.out.println("*******************************Lunch Menu Details::MenuService*****************************************");
	System.out.println("South Indian Meals/tNorth Indian Meals/tPanneer Fried Rice/tVeg Fried Rice");
	}
}
