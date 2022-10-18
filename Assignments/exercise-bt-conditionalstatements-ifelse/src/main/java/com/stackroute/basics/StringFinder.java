package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner scanner = new Scanner(System.in);
    private String searchString;
    private String firstString;
    private String secondString;
    public static void main(String[] args) {
        //Get three strings from the user
        new StringFinder().getInput();
    }

    public String getInput() {
        searchString=scanner.nextLine();
        firstString=scanner.nextLine();
        secondString=scanner.nextLine();
        closeScanner();
        int a=new  StringFinder().findString(searchString,firstString,secondString);
        new StringFinder().displayResult(a);
        return null;

    }

    public void displayResult(int result) {
        //displays the result
        if(result==1) {
            System.out.println("Found as expected");
        }
        else if(result==-1) {
            System.out.println("Empty string or null");
        }
        else {
            System.out.println("Not found");
        }
    }

    public int findString(String searchString, String firstString, String secondString) {

        if(searchString==null ||firstString==null || searchString.equals("")||firstString.equals("")||secondString==null || secondString.equals(""))
            return -1;
        else if(searchString.contains(firstString) && searchString.contains(secondString))
        {
            if(searchString.indexOf(firstString)<searchString.indexOf(secondString))
                return 1;
            else
                return 0;
        }
        else
            return 0;
    }

    public void closeScanner() {
        scanner.close();
    }
}
