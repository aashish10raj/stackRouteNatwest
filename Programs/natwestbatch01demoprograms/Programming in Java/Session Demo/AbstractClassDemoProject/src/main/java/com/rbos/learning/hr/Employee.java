package com.rbos.learning.hr;

public abstract class Employee {
    int employeeId;
    String name;
    double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployeePersonalInfo(){
        System.out.println(name+" :: "+salary);
    }

    public abstract double calculateIncrement(float hikePrecentage);
}
