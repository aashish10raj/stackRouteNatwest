package com.natwest.learning.lambda;

public interface Calculation {
    double compute(double num1, double num2);//SAM

    public static double performCalculation(Calculation calc, double num1, double num2){
        return calc.compute(num1,num2);
    }
}
