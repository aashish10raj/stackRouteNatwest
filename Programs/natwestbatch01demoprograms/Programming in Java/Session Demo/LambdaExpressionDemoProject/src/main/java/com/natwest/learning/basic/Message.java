package com.natwest.learning.basic;
@FunctionalInterface
public interface Message {
    void textMessage(); // SAM
   // void whatsAppMessage();
    default void whatsAppMessage(){
        System.out.println("Hello ! Functional Interface");
    }
}
