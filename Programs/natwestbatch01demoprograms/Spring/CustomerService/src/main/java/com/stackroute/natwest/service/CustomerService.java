package com.stackroute.natwest.service;

import java.util.List;

import com.stackroute.natwest.model.Customer;

public interface CustomerService {
	public boolean addCustomer(Customer c);
	public List<Customer> getAllCustomers();
	public boolean validate(Customer customer);
	

}
