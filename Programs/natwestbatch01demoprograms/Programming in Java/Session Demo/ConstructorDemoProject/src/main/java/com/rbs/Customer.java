package com.rbs;

import java.util.Scanner;

class CustomerImpl{
    public static void main(String[] args) {
        Customer customer=new Customer(); // Default Constructor
        customer.acceptDetails();
        customer.printDetails();
    }
}

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private long mobNo;

    public void acceptDetails(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Customer Details :");
        System.out.println("Enter Customer ID :");
        customerId=scanner.nextInt();
        System.out.println("Enter Customer Name :");
        name=scanner.next();
        System.out.println("Enter Customer Email ID :");
        email=scanner.next();
        System.out.println("Enter Customer Mobile Number :");
        mobNo=scanner.nextLong();
    }
    public void printDetails(){
        System.out.println("Customer Details : ");
        System.out.println("Customer ID : "+customerId);
        System.out.println("Customer Name : "+name);
        System.out.println("Customer Email : "+email);
        System.out.println("Customer Mobile Number : "+mobNo);

    }
}
