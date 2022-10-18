package com.natwest.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamImpl1 {
    public static void main(String[] args) {
        // Creating stream with fixed number of integers
//        Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9);
//        stream.forEach(p-> System.out.println(p));

        // Creating Stream for Arrays
//        Stream<Integer> stream1=Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
//        stream1.forEach(p-> System.out.println(p));

        // Creating Stream for collection

        List<String> items=new ArrayList<>();
        items.add("Iphone");
        items.add("HeadPhone");
        items.add("Mouse");

        Stream<String> stream=items.stream();
        stream.forEach(p-> System.out.println(p));
    }
}
