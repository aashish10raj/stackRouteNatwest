package com.stackroute.natwest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.natwest.dao.CustomerDAO;
import com.stackroute.natwest.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDAO dao;
	
	
	public boolean addCustomer(Customer c) {
		Customer customer = dao.save(c);
		if(customer !=null) {
			return true;
		}
		return false;
	}
	
	public List<Customer> getAllCustomers(){
		return dao.findAll();
	}

	@Override
	public boolean validate(Customer customer) {
		Optional<Customer> optCustomer=dao.findById(customer.getCustomerName());
		if(optCustomer.isPresent()) {
			return true;
		}
		return false;
	}

}
