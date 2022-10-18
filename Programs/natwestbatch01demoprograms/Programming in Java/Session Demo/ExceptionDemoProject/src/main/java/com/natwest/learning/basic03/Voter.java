package com.natwest.learning.basic03;

public class Voter {
    String voterId;
    String name;
    int age;

    public Voter() {
    }

    public Voter(String voterId, String name, int age) {
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void validateAge(int age) throws AgeException{
        if(age<18)
            throw new AgeException("You supposed to be 18+ ");
        else {
            System.out.println("You have registered successfully");
        }
    }

}
