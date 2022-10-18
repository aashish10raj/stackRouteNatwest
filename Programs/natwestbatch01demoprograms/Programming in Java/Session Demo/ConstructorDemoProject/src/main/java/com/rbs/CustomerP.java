package com.rbs;

import java.util.Scanner;

class CustomerPImpl{
    public static void main(String[] args) {
        CustomerP customer1=new CustomerP(); // Default Constructor
        customer1.printDetails();
        CustomerP customer2=new CustomerP(2, "Sam", "Sam@gmail.com",9865332211l);
        customer2.printDetails();
        CustomerP customer3=new CustomerP(3, "Peter", "Peter@gmail.com");
        customer3.printDetails();
    }
}

public class CustomerP {
    private int customerId;
    private String name;
    private String email;
    private long mobNo;

    public CustomerP(){
        customerId=1;
        name="John";
        email="John@gmail.com";
        mobNo=9876554433l;
    }

    public CustomerP(int customerId, String name, String email){
        this.customerId=customerId;
        this.name=name;
        this.email=email;
        this.mobNo=9566778811l;
    }

    public CustomerP(int customerId, String name, String email, long mobNo){
        this.customerId=customerId;
        this.name=name;
        this.email=email;
        this.mobNo=mobNo;
    }


    public void printDetails(){
        System.out.println("Customer Details : ");
        System.out.println("Customer ID : "+customerId);
        System.out.println("Customer Name : "+name);
        System.out.println("Customer Email : "+email);
        System.out.println("Customer Mobile Number : "+mobNo);

    }
}

