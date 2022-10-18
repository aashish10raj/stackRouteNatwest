package com.natwest.learning.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ProgramImpl{
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1, "Sam", 8000.00));
        employees.add(new Employee(2, "Peter", 4500.00));
        employees.add(new Employee(3, "Steve", 9000.00));
        employees.add(new Employee(4, "Mark", 3500.00));
        employees.add(new Employee(5, "Andy", 2000.00));

        Predicate<Employee> predicate=emp->emp.salary>3500;
        List<Employee> list=employees.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        for(Employee e:list){
            System.out.println(e.employeeId);
            System.out.println(e.name);
            System.out.println(e.salary);
        }
    }
}

public class Employee {
    int employeeId;
    String name;
    double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
}
