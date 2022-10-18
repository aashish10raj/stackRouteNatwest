package com.natwest.learning.sorting.comparable;

import com.natwest.learning.sorting.comparable.Customer;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableImpl {
    public static void main(String[] args) {
        ArrayList<Customer> list=new ArrayList<>();
        list.add(new Customer(1, "Sam", 28));
        list.add(new Customer(2, "Peter", 21));
        list.add(new Customer(3, "Will", 40));
        list.add(new Customer(4, "John", 23));
        list.add(new Customer(5, "Andy", 19));

        for(Customer c:list){
            System.out.println(c.getCustomerId()+" : "+c.getName()+" : "+c.getAge());
        }
        System.out.println("----------------------------------After Sorting-------------------------------------");
        Collections.sort(list);
        for(Customer c:list){
            System.out.println(c.getCustomerId()+" : "+c.getName()+" : "+c.getAge());
        }

    }
}
