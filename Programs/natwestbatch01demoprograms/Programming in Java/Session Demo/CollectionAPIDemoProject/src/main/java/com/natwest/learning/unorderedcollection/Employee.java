package com.natwest.learning.unorderedcollection;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String firstName;
    private double salary;

    public Employee(int employeeId, String firstName, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getEmployeeId()-employee.getEmployeeId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Annonymous class implementing Comparator interface
    public static  final Comparator<Employee> COMPARE_BY_SALARY=new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            int difference=Double.compare(e1.getSalary(),e2.getSalary());
                    if(difference==0){
                        difference=e1.getFirstName().compareTo(e2.getFirstName());
                    }
                    return difference;
        }
    };
}
