package com.natwest.learning.basic;

public class LambdaDemo {
    public static void main(String[] args) {
       Message m=()-> System.out.println("Hello ! Lambda");
       m.textMessage();
      Dream d= ()-> System.out.println("Dream is to succeed in Our life");
      d.everyDayDream();
    }
}
