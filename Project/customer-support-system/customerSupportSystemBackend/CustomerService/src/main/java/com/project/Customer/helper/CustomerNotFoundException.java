package com.project.Customer.helper;

public class CustomerNotFoundException extends  Exception {
    public CustomerNotFoundException() {
        super("User with this Customer Id and password not exist !! try with another one");
    }
}
