package com.project.Customer.dao;

import com.project.Customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT * FROM bank_customers where customer_id=?1 ", nativeQuery = true)
    Customer getCustomerById(String customerId);

    Customer findBycustomerId(String customerId);

    @Query(value = "SELECT * FROM bank_customers where customer_id=?1 AND password=?2 ", nativeQuery = true)
    Customer getCustomerByIdAndPassword(String customerId, String password);

}
