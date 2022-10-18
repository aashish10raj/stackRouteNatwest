package org.natwest.learning.objectdemo;

class HashCodeImpl{
    public static void main(String[] args) {
        Customer customer1=new Customer(1234, "Divyani", "Divyani@gmail.com",7654321122l);
        Customer customer2=new Customer(1543, "Amal", "Amal@gmail.com",7654324455l);
        Customer customer3=new Customer(2234, "Haresh", "Haresh@gmail.com",7654326838l);

        System.out.println("Hashcode of Customer1 = "+customer1.hashCode());
        System.out.println("Hashcode of Customer2 = "+customer2.hashCode());
        System.out.println("Hashcode of Customer3 = "+customer3.hashCode());
    }
}

public class Customer {
    int customerId;
    String name;
    String email;
    long mobileNo;

    public Customer(int customerId, String name, String email, long mobileNo) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public int hashCode(){
        return customerId;
    }
}
