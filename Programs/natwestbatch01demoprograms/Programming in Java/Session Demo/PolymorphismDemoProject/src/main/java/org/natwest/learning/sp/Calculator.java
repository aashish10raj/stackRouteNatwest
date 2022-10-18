package org.natwest.learning.sp;

class CalculatorImpl{
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(50,100);
        calculator.add(10,20,30);
        calculator.add("10","20");
        calculator.add(30,20.5f);
        calculator.add(60.6f,32);
    }
}

public class Calculator {

    public void add(int a, int b){
        System.out.println(a+b);
    }
    // Number of Parameter
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(String a, String b){
        System.out.println(a+b); // 10 20
    }
    // type of parameter
    public void add(int a, float b){
        System.out.println(a+b);
    }
    // order of parameter
    public void add(float a , int b){
        System.out.println(a+b);
    }
}
