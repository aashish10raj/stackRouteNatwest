package com.natwest.learning.sorting.comparable;

public class Customer implements Comparable<Customer> {
    private int customerId;
    private String name;
    private int age;

    public Customer(int customerId, String name, int age) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer customer) {
        if(age==customer.age)
        return 0;
        else if (age>customer.age)
            return 1;
        else
            return -1;
    }
}
