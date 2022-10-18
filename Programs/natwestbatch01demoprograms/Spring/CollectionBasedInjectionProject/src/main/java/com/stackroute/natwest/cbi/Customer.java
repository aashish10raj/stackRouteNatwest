package com.stackroute.natwest.cbi;

import java.util.List;

public class Customer {
	private int customerId;
	private String name;
	private List<Address> addresses;
	
	public Customer() {

	}

	public Customer(int customerId, String name, List<Address> addresses) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.addresses = addresses;
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

	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
}
