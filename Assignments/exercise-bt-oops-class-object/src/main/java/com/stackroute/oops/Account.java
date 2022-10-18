package com.stackroute.oops;

/*
   This class is used to store account details
 */
public class Account {
    private int accountNo;
    private double balance;
    private String status;
    private static int counter;
    public Account(double balance, String status) {
        this.balance = balance;
        this.status = status;
        this.accountNo = ++(Account.counter);
    }
    public boolean depositAmount(double amount) {
        if(getStatus().equals("active")){
            this.balance = getBalance() + amount;
            return true;
        }
        return false;
    }

    public String getAccountDetails() {
        return "[Account No : "+getAccountNo()+", Status : "+getStatus()+", Balance : "+getBalance()+"]";
    }

    public static int getCounter() {
        return Account.counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }

    public int getAccountNo() {
        return this.accountNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getStatus() {return this.status;}

    public void setStatus(String status) {
        this.status = status;
    }
}
