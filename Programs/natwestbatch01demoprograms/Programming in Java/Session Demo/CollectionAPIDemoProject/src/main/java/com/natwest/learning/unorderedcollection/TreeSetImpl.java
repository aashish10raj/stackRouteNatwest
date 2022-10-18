package com.natwest.learning.unorderedcollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
//        Set<Employee> employeeSet=new TreeSet<>();
        Set<Employee> employeeSet=new TreeSet<>(Employee.COMPARE_BY_SALARY);
        addEmployees(employeeSet);
        printEmployees(employeeSet);
    }

    private static void addEmployees(Set<Employee> employeeSet){
        Employee e1=new Employee(1, "Sam", 87556);
        Employee e2=new Employee(2, "Andy", 67556);
        Employee e3=new Employee(3, "Bill", 57556);
        Employee e4=new Employee(4, "Robert", 97556);
        Employee e5=new Employee(5, "Shane", 47556);

        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e5);
    }

    private static void printEmployees(Set<Employee> employeeSet){
        for(Employee employee:employeeSet){
            System.out.println(employee);
        }
    }
}
