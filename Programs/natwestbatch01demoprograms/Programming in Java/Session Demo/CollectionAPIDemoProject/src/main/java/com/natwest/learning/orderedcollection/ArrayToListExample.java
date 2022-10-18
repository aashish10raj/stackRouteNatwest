package com.natwest.learning.orderedcollection;

import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {
    public static void main(String[] args) {
        // Convert array to List
        String[] strArr=new String[]{"Apple","Mango","Orange","Black Berry"};
        List<String> fruits= Arrays.asList(strArr);
        System.out.println(fruits);

        // convert list to array
        String arr[]=fruits.toArray(new String[0]);
        for(String str:arr){
            System.out.println(str);
        }
    }
}
