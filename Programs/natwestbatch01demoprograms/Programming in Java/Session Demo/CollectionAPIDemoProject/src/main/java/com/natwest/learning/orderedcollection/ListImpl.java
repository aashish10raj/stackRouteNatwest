package com.natwest.learning.orderedcollection;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Peter");
        list.add("Sam");
        list.add(new Integer(10));
        list.add(new Character('M'));
        list.add(23.5);
        list.add("Sam"); // will accept duplicate
        System.out.println(list);
        list.add(2,20);
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println("Does list contain 10 : "+list.contains(10));
        System.out.println("Index of element : "+list.indexOf(23.5));
        System.out.println("Is list empty : "+list.isEmpty());
        list.set(6,"John");
        System.out.println(list);
        list.remove(5);
        list.remove("Sam");
        System.out.println(list);
    }
}
