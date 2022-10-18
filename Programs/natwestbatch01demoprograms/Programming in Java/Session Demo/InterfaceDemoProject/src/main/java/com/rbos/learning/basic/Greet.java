package com.rbos.learning.basic;

class InterfaceImpl{
    public static void main(String[] args) {
        Greet greet;
        greet=new Computer();
        greet.sayHello();
        greet=new Human();
        greet.sayHello();
    }
}

public interface Greet {
    int noOfTimes=3; // static & final
    void sayHello(); // public & abstract
}

class Computer implements Greet{

    public void sayHello() {
     //   noOfTimes=5;
        System.out.println("Welcome ! Rajeev");
    }
}

class Human implements Greet{

    public void sayHello() {
        System.out.println("Hello ! Team");
    }
}
