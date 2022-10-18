package com.natwest.hr;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee employee=new Employee(1,"Haresh","876543211234",80000.00);
        employee.setName("Haresh Shingare");
        employee.raiseSalary(12000.00);
        System.out.println("Employee ID = "+employee.getEmployeeId());
        System.out.println("Employee Name = "+employee.getName());
        System.out.println("Employee SSN = "+employee.getSocialSecurityNumber());
        System.out.println("Salary = "+employee.getSalary());
    }
}
