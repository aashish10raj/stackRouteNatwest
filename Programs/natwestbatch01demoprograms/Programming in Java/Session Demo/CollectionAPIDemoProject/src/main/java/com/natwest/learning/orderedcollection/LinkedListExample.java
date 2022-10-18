package com.natwest.learning.orderedcollection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> strList=new LinkedList<>();
        addElement(strList);
        searchElements(strList);
        removeElements(strList);
        printElements(strList);
    }

    // Method to add element
    public static void addElement(LinkedList<String> strList){
        strList.add(new String("James Gosling"));
        strList.add(new String("Azeem Premji"));
        strList.add(new String("Nandan Nilkeni"));
        strList.add(new String("Sunadr Pichai"));
        strList.add(new String("Satya Nandela"));
        strList.add(new String("N Narayan Murthy"));
    }
    // Method to Search element
    public static  void searchElements(LinkedList<String> strList){
        System.out.println(strList.get(3));
    }
    public static void removeElements(LinkedList<String> strList){
        strList.remove(4);
    }
    // Method to traverse element
    public static void printElements(LinkedList<String> strList){
        for(String name:strList){
            System.out.println(name);
        }
    }
}
