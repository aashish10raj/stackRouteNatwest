package com.stackroute.natwest.wiring;

import java.util.List;

public class Customer {
	private int customerId;
	private String name;
	private Address homeAddress;
	private Address officeAddress;
	
	public Customer() {

	}

	public Customer(int customerId, String name, Address homeAddress, Address officeAddress) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", homeAddress=" + homeAddress
				+ ", officeAddress=" + officeAddress + "]";
	}
	
}
