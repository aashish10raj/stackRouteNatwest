package com.stackroute.collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    //write logic to find binary number from 1 to given input

    public String findBinaryNumbersSequence(int input) {

        if(input==0 || input<0){
            return "Give proper input not zero or negative";
        }
        else if(input>20){
            return "Give proper input not greater than 20";
        }
        else{

            Queue<String> queue = new LinkedList<String>();
            queue.add("1");


            StringBuilder s = new StringBuilder();
            while (input-- > 0) {

                String s1 = queue.poll();

                s.append(s1);
                s.append(" ");


                String s2 = s1;


                queue.add(s1 + "0");


                queue.add(s2 + "1");
            }

            s.deleteCharAt(s.length()-1);
            return s.toString();
        }
        }
//        return null;
    }
