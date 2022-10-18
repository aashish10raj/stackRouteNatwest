package com.natwest.banking;

import java.util.Scanner;

public class AccountImpl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Account Number : ");
        long accNo= scanner.nextLong();
        System.out.println("Enter the Account Holder Name : ");
        String accName= scanner.next();
        System.out.println("Enter the Account Balance : ");
        double accBalance= scanner.nextDouble();
        System.out.println("Enter the Account Minimum Balance :");
        double accMinBalance= scanner.nextDouble();

        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.setAccountNumber(accNo);
        savingsAccount.setName(accName);
        savingsAccount.setBalance(accBalance);
        savingsAccount.setMinBalanace(accMinBalance);

        System.out.println(savingsAccount.toString());

    }
}
