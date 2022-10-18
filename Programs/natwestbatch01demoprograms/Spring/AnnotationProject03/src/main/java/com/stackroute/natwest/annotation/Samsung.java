package com.stackroute.natwest.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	@Qualifier("snapdragon")
	private MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void features() {
		System.out.println("Octa Core, 8GB RAM, 52MP Camera");
		cpu.process();
	}

}
