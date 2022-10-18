package com.stackroute.natwest.mdb.model;

public class Sim {
	private int simid;
	private String serviceProvider;
	
	public Sim() {
		super();
	}

	public Sim(int simid, String serviceProvider) {
		super();
		this.simid = simid;
		this.serviceProvider = serviceProvider;
	}

	public int getSimid() {
		return simid;
	}

	public void setSimid(int simid) {
		this.simid = simid;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
}
