package com.stackroute.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    private static Scanner scan;
    public int firstValue, secondValue, operator;


    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        char sign='y';
        while (sign=='y') {
            firstValue = scan.nextInt();
            secondValue = scan.nextInt();
            operator = scan.nextInt();
            String finalValue = new Calculator().calculate(firstValue, secondValue, operator);
            System.out.println(finalValue);
            sign = scan.next().charAt(0);
        }

    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
    String value;
    int result;
        switch (operator){
            case 1:
                result=firstValue+secondValue;
                value=firstValue + " + " + secondValue + " = " + result;
                break;
            case 2:
                result=firstValue-secondValue;
                value=firstValue + " - " + secondValue + " = " + result;
                break;
            case 3:
                result=firstValue*secondValue;
                value=firstValue + " * " + secondValue + " = " + result;
                break;
            case 4:
                if(secondValue!=0){
                    result=firstValue/secondValue;
                    value=firstValue + " / " + secondValue + " = " + result;
                }
                else{
                    value="The divider (secondValue) cannot be zero";
                }
                break;
            default:
                value="Entered wrong option " + operator;

        }
        return value;
    }
}
