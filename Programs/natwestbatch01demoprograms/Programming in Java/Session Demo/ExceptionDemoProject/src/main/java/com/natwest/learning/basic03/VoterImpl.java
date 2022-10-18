package com.natwest.learning.basic03;

import java.util.Scanner;

public class VoterImpl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Voter ID : ");
        String voterId=scanner.next();
        System.out.println("Enter Voter Name : ");
        String name=scanner.next();
        System.out.println("Enter Voter Age : ");
        int age=scanner.nextInt();

        Voter voter=new Voter();

        try{
            voter.validateAge(age);
        }catch (AgeException e){
            e.printStackTrace();
        }
        System.out.println("Control Back to Main Menu");
    }
}
