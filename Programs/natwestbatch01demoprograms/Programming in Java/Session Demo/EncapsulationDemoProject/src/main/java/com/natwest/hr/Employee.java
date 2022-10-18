package com.natwest.hr;

public class Employee {
    // private data
    private int employeeId;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    // Default constructor
    public Employee() {
    }

    // parameterized constructor
    public Employee(int employeeId, String name, String socialSecurityNumber, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }
    // Business Method

      public void setName(String newName){
        if(newName !=null){
            this.name=newName;
        }
      }
      public void raiseSalary(double increase){
        this.salary +=increase;
      }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }
}


