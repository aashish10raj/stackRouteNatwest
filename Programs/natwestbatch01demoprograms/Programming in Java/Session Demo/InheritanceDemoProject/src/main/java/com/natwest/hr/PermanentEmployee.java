package com.natwest.hr;

public class PermanentEmployee extends Employee{
    private double pfPrecentage;
    private double pfAmount;

    // Business Methods

    public void findNetSalary(){
        double x=0;
        pfAmount=(super.getSalary()*pfPrecentage)/100;
        x=super.getSalary()-pfAmount;
        setNetSalary(x);
    }
    public boolean validateInput(){
        if((super.getSalary()>0) && (pfPrecentage >=0))
            return true;
        else
            return false;
    }

    public double getPfPrecentage() {
        return pfPrecentage;
    }

    public void setPfPrecentage(double pfPrecentage) {
        this.pfPrecentage = pfPrecentage;
    }

    public double getPfAmount() {
        return pfAmount;
    }

    public void setPfAmount(double pfAmount) {
        this.pfAmount = pfAmount;
    }
}
