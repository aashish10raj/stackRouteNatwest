package com.natwest.hr;

import java.util.Scanner;

public class EmployeeImpl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Employee ID : ");
        int empId=scanner.nextInt();
        System.out.println("Enter the Employee Name : ");
        String eName=scanner.next();
        System.out.println("Enter the Salary : ");
        double eSal=scanner.nextDouble();
        System.out.println("Enter the PF Precentage: ");
        double pfPrec=scanner.nextDouble();

        boolean p=true;

        PermanentEmployee employee=new PermanentEmployee();
        employee.setEmployeeId(empId);
        employee.setName(eName);
        employee.setSalary(eSal);
        employee.setPfPrecentage(pfPrec);

        p=employee.validateInput();

        if(p==false){
            System.out.println("Wrong Input !!! Unable to Calculate NetSalary");
        }else{
            employee.findNetSalary();
            System.out.println("Employee ID : "+employee.getEmployeeId());
            System.out.println("Employee Name : "+employee.getName());
            System.out.println("PF Amount : "+String.format("%.2f",employee.getPfAmount()));
            System.out.println("NetSalary : "+String.format("%.2f",employee.getNetSalary()));
        }



    }
}
