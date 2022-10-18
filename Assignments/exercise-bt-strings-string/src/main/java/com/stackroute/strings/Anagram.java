package com.stackroute.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static String phraseOne;
    public static String phraseTwo;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        phraseOne=sc.nextLine();
        phraseTwo=sc.nextLine();
        new Anagram().checkAnagrams(phraseOne,phraseTwo);
    }
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if(phraseOne==null || phraseTwo==null || phraseOne.equals("") || phraseTwo.equals(""))
            return "Give proper input not empty phrases";
        else {
            int length1 = phraseOne.length();
            int length2 = phraseTwo.length();
            if (length1 != length2)
                return "Given phrases are not anagrams";
            else{
                int temp=0;
                char[] tempArray1=phraseOne.toCharArray();
                char[] tempArray2=phraseTwo.toCharArray();
                Arrays.sort(tempArray1);
                Arrays.sort(tempArray2);
                String s1=new String(tempArray1);
                String s2=new String(tempArray2);
                if(s1.equals(s2)) {
                    return "Given phrases are anagrams";
                }
                else {
                    return "Given phrases are not anagrams";
                }
                }

            }
        }

    }

