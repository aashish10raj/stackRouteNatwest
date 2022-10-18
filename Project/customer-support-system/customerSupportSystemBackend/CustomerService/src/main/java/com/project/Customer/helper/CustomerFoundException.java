package com.project.Customer.helper;

public class CustomerFoundException extends  Exception{
    public CustomerFoundException() {
        super("User with this Username is already there in DB !! try with another one");
    }

    public CustomerFoundException(String msg)
    {
        super(msg);
    }
}
