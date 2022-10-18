package com.rbs.basic;

import java.util.Scanner;

public class Addition {
    private int firstNumber;
    private int secondNumber;

    private static int thridNumber=100;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        firstNumber=scanner.nextInt();
        System.out.println("Enter Second Number : ");
        secondNumber=scanner.nextInt();
    }
    public void add(){
        int sum=firstNumber+secondNumber+thridNumber;
        System.out.println("Sum = "+sum);
}
}
