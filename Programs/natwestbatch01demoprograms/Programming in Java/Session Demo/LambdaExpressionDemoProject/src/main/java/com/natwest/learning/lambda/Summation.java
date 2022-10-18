package com.natwest.learning.lambda;

import java.util.*;

public class Summation implements Calculation{
    @Override
    public double compute(double num1, double num2) {
        return num1+num2;
    }

    public static void main(String[] args) {
        // Creating a new Instance | By Implementing Interface
//        Calculation add=new Summation();
//        System.out.println(Calculation.performCalculation(add,20.0,25.0));

        // By using annonymous inner class
//        Calculation multiply=new Calculation() {
//            @Override
//            public double compute(double num1, double num2) {
//                return num1*num2;
//            }
//        };
//        System.out.println(Calculation.performCalculation(multiply,25.0,10.0));

        // By using Lambda Expression
//        Calculation division=(num1,num2)->num1/num2;
        System.out.println(Calculation.performCalculation((num1,num2)->num1/num2,100.0,25.0));
        System.out.println(Calculation.performCalculation((num1,num2)->num1*num2,100.0,25.0));
        System.out.println(Calculation.performCalculation((num1,num2)->num1+num2,100.0,25.0));
        System.out.println(Calculation.performCalculation((num1,num2)->num1-num2,100.0,25.0));

        // Sorting using Comparator
        List<String> fruits=new ArrayList<>(List.of("PomeGranate","DragonFruits","Mango","Apple","Black Berry","Grapes"));
        System.out.println(fruits);
//        Comparator<String> lengthComparator=(str1,str2)->str1.length()-str2.length();
        Collections.sort(fruits,(str1,str2)->str1.length()-str2.length());
        System.out.println("After Sorting : "+fruits);

        // forEach Method
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(i -> System.out.println(i) );

    }
}
