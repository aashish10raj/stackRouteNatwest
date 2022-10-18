package com.stackroute.strings;

public class LongestSubString {

    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {

        int length=input.length();
        if(length!=0)
        {   int status=0;
            StringBuilder builder = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < length; i++) {
                temp.append(input.charAt(i));
                int len = temp.length();
                if (i <=(length / 2) && temp.toString().equals(input.substring(length - len, length).toString()))
                {   builder.append(temp);
                    status=1;
                }
            }
            if(status==1){

                return builder;

            }
            else
                return new StringBuilder("Longest substring is not present in the given StringBuilder");
        }
        else
            return new StringBuilder("Give proper input");
    }
    }

