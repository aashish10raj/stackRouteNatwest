package com.rbs;

import java.util.Scanner;

public class ArrayDemo5 {

    public static void main(String[] args) {
        int length;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Length :");
        length=scanner.nextInt();

        int m3[]=new int[length];
        System.out.println("Enter"+length+"Elements to store in Array : \n");
        for(int i=0;i<length;i++){
            m3[i]=scanner.nextInt();
        }
        System.out.println("Elements in Array are : \n");
        for(int element:m3){
            System.out.println(element);
        }
    }
}
