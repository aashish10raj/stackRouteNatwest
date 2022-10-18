package com.rbs.basic;

public class StringExample {
    public static void main(String[] args) {
        String str1="NatWest";
        String str2="NatWest";
        String str3="StackRoute";

        String str4=new String("NatWest");
        String str5=new String("Java FSD");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());
    }
}
