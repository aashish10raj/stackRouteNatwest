package com.natwest.learning.orderedcollection;

import java.util.ArrayList;
import java.util.List;

public class GenericImpl {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
     //   list.add("Will"); // Compilation Error.
    }
}
