package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Sample code on Matcher  methods find, start and end
public class MatcherRegexDemo {
    public static void main(String args[]){
        String content = "ZZZ AA PP AA QQQ AA ZZ";

        String string = "AA";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(content);


        // Does not provides any o/p
        // while (Pattern.matches(content, string)){

   //      while(Pattern.compile(string).matcher(content).find()){

        // OR

        while(matcher.find()) {
            System.out.println("Found at: "+ matcher.start()  // 4 - 6 , 10-12, 17-19
                    +
                    " - " + matcher.end());
        }
    }
}
