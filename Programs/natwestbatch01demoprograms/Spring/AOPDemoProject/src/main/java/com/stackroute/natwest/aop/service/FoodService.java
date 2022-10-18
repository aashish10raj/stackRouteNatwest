package com.stackroute.natwest.aop.service;

import org.springframework.stereotype.Service;

@Service
public class FoodService {
	    // Log
		// Security
		// Transaction
		
		
		public void breakfastMenuDetails() {
			System.out.println("*******************************Beakfast Menu Details::FoodService*****************************************");
			System.out.println("Idli/tMasala Dosa/tPanneer chilli/tPulav");
//			throw new NullPointerException();
		}
		
		public void lunchMenuDetails() {
		System.out.println("*******************************Lunch Menu Details::FoodService*****************************************");
		System.out.println("South Indian Meals/tNorth Indian Meals/tPanneer Fried Rice/tVeg Fried Rice");
		}
	}


