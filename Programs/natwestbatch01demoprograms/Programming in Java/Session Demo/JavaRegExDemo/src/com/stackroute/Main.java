package com.stackroute;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String content = "This is StackRoute " +
                "your route to become a fullstack developer";
        String word = "e";
        String pattern = ".*route.*";

        boolean isMatch = Pattern.matches(pattern, content);

        System.out.println("The text contains 'route'? \n" + isMatch); // true

        isMatch = Pattern.matches("[aeiou]", word);
        System.out.println("The text contains vowels ? \n" + isMatch);

        isMatch = Pattern.matches("[aeiou]", "a");
        System.out.println("The text contains vowels ? \n" + isMatch);
    }
}
