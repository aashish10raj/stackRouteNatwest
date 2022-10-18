package com.rbos.learning.banking;

import java.util.Scanner;

public class InterestImpl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Precentage precentage=new InterestCalculator();
        System.out.println("Enter the amount for which interest must be calculated");
        double amount= scanner.nextDouble();
        System.out.println("The interest amount to be paid is");
        System.out.println(precentage.calculateInterest(amount));
    }
}
