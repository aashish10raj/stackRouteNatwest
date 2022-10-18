package com.stackroute.oops;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private Address address;

    public Customer() {
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public boolean equals(Object customer){

        if(!(customer instanceof Customer)) {
            return false;
        }
        Customer c = (Customer) customer;

        if(this.getEmail()==null && c.getEmail()==null){
            return true;
        }
        if(this.getEmail()==null || c.getEmail()==null){
            return false;
        }
        return this.getCustomerId() == c.getCustomerId() && this.getName().equals(c.getName())
                && this.getAddress().equals(c.getAddress()) && this.getEmail().equals(c.getEmail());
    }

}