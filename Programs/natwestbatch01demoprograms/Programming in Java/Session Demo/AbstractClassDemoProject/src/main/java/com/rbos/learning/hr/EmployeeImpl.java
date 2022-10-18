package com.rbos.learning.hr;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee manager=new Manager(2345, "Sam", 100000.00,21,7);
        manager.displayEmployeePersonalInfo();
        System.out.println(manager.calculateIncrement(1.5f));

        Employee regionalHead=new RegionalHead(1543, "Peter", 200000.00,"South",7, 8);
        regionalHead.displayEmployeePersonalInfo();
        System.out.println(regionalHead.calculateIncrement(1.5f));

        }
    }

