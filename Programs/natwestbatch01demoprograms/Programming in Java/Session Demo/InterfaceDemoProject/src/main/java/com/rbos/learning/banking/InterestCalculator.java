package com.rbos.learning.banking;

public class InterestCalculator implements Precentage{
    public double calculateInterest(double amount) {
        return amount*this.rateOfInterest/100;
    }
}
