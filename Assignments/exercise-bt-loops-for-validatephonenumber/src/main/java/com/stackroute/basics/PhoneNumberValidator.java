package com.stackroute.basics;

import java.util.Scanner;


public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String number=new  PhoneNumberValidator().getInput();
        new PhoneNumberValidator().closeScanner();
        int result=new PhoneNumberValidator().validatePhoneNumber(number);
        new PhoneNumberValidator().displayResult(result);
    }
    public String getInput() {
        String phone=scanner.nextLine();
        return phone;
    }
    public void displayResult(int result) {
        if(result==1)
            System.out.println("Valid");
        else if (result==-1) {
            System.out.print("Emptystring");

        } else
            System.out.println("Invalid");
    }
    public int validatePhoneNumber(String input) {
        int count=0,dash=0;
        if(input==null || input.equals(""))
        {
            return -1;
        }
        else {
            for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i)>='0' && input.charAt(i)<='9')
                {
                    count++;
                }
                else if(input.charAt(i)=='-')
                    dash++;
                else
                {
                    return 0;
                }
            }
            if(count==10 && dash==2)
                return 1;
            else
                return  0;
        }

    }
    public void closeScanner(){
//        //close the Scanner object
        scanner.close();
   }
}