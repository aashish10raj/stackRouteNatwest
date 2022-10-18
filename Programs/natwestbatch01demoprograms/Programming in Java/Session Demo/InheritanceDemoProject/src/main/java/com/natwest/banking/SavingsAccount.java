package com.natwest.banking;

public class SavingsAccount extends Account{
    private double minBalanace;

    public double getMinBalanace() {
        return minBalanace;
    }

    public void setMinBalanace(double minBalanace) {
        this.minBalanace = minBalanace;
    }

    public String toString(){
        String str="Account Number : "+String.valueOf(getAccountNumber())+" : "+" Name : "+getName()+" : "+"Account Balance : "+String.valueOf(getBalance())+" : "+"Minimum Balance : "+String.valueOf(getMinBalanace());
        return str;
    }

}
