package com.stackroute.natwest.annotation;

import org.springframework.stereotype.Component;

@Component("mediatek")
public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("2nd Best Processor");

	}

}
