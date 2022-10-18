package com.stackroute.natwest.annotation;

import org.springframework.stereotype.Component;

@Component("snapdragon")
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("Best Processor");

	}

}
