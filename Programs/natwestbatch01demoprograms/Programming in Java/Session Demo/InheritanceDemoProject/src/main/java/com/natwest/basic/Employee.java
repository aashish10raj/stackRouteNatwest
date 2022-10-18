package com.natwest.basic;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
class Director extends Employee{
    private int din;

    public Director(int employeeId, String name, double salary, int din) {
        super(employeeId, name, salary);
        this.din=din;
    }
}
class Manager extends Employee{
    private String dept;

    public Manager(int employeeId, String name, double salary,String dept) {
        super(employeeId, name, salary);
        this.dept=dept;
    }

    public String getDept() {
        return dept;
    }
}
