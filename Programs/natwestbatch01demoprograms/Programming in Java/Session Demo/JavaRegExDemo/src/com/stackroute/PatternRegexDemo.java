package com.stackroute;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternRegexDemo {
    public static void main(String args[]) {
        String text = "ThisIsStackRoute. ItISJava trainingSession";
        // Pattern for delimiter
        String patternString = "is";


        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        String[] myStrings = pattern.split(text); // is

        for (String temp : myStrings) {
            System.out.println(temp);
        }

        // Th
        // StackRoute. It
        // Java training session
        System.out.println("Number of split strings: " + myStrings.length);



    }
}
