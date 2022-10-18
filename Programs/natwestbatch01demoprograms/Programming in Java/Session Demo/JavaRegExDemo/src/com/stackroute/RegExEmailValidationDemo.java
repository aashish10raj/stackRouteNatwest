package com.stackroute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmailValidationDemo {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
                                   // Rajeev_1983+@+gmail+.com
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String emailStr = sc.nextLine();
        System.out.println("Validation output : " + validate(emailStr));

        
    }
    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

}
