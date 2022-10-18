package com.project.Customer.services;

import com.project.Customer.dao.CustomerDAO;
import com.project.Customer.helper.CustomerFoundException;
import com.project.Customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerDAO dao;


//    public boolean addCustomer(Customer c) {
//        Customer customer = dao.save(c);
//        if(customer !=null) {
//            return true;
//        }
//        return false;
//    }
    public Customer addCustomer(Customer c) throws Exception {
        Customer local = this.dao.findBycustomerId(c.getCustomerId());
        if (local != null) {
            System.out.println("User is already there !!");
            throw new CustomerFoundException();
        } else {
            c.setCreditrating((int)(Math.random()*(900-300+1)+300));
            local = this.dao.save(c);
        }
        return local;
    }
    public List<Customer> getAllCustomers(){
        return dao.findAll();
    }

    public Customer getCustomer(String customerId){
        return dao.getCustomerById(customerId);
    }
    public boolean validate(Customer customer) {
        //Optional<Customer> optCustomer=dao.findBycustomerId(customer.getCustomerId());
        //Customer c=dao.findBycustomerId(customer.getCustomerId());
        Customer c=dao.getCustomerByIdAndPassword(customer.getCustomerId(),customer.getPassword());
        if(c!=null) {
            return true;
        }
        return false;
    }
}
