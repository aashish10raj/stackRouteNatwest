package com.stackroute.natwest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.natwest.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, String> {

}
