package com.stackroute.natwest.ioc;

public class Employee {
   private int employeeId;
   private String name;
   private double salary;
   
public Employee() {
	System.out.println("--------Employee Object Constructed-----------");
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
}

public void myInit() {
	System.out.println("Object Initialized");
}
public void myDestroy() {
	System.out.println("Object Destroyed");
}

}
