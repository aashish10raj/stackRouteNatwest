package com.natwest.learning.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorImpl {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"Divyani",21, 80000.00));
        list.add(new Employee(2,"Haresh",23, 90000.00));
        list.add(new Employee(3,"Aghalaya",19, 70000.00));
        list.add(new Employee(4,"Harshitha",26, 100000.00));
        list.add(new Employee(5,"Gaurav",22, 60000.00));

        for(Employee e:list){
            System.out.println(e.getEmployeeId()+" : "+e.getName()+" : "+e.getAge()+" : "+e.getSalary());
        }

        System.out.println("**************************************Sorting by Name**********************************");
        Collections.sort(list,new NameComparator());
        for(Employee e:list){
            System.out.println(e.getEmployeeId()+" : "+e.getName()+" : "+e.getAge()+" : "+e.getSalary());
        }
        System.out.println("**************************************Sorting by Age**********************************");
        Collections.sort(list,new AgeComparator());
        for(Employee e:list){
            System.out.println(e.getEmployeeId()+" : "+e.getName()+" : "+e.getAge()+" : "+e.getSalary());
        }
    }
}
