package com.stackroute.natwest.di;

public class Customer {
	private int customerId;
	private String name;
	private Address address;
	
	public Customer() {

	}
    // Constructor Injection
	public Customer(Address address) {
		super();
		this.address = address;
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

	public Address getAddress() {
		return address;
	}
       // Setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + "]";
	}
	
}
