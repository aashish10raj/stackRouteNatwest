package com.natwest.learning.basic;

import java.util.Scanner;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        try {
            int x;
            int y;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter x value");
            x = scanner.nextInt();
            System.out.println("Enter y value");
            y = scanner.nextInt();

            int result = x / y;
            System.out.println("Result = " + result);
        }catch (Exception e){
            System.out.println("Error : Divide By Zero Error");
        }
    }
}
