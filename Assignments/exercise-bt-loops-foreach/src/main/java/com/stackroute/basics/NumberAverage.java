package com.stackroute.basics;

import java.util.Scanner;
public class NumberAverage {
    public int size;
    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }
    //get the values of the array from the user
    public void getArrayValues() {
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        String a=new NumberAverage().findAverage(arr);
        System.out.println(a);
    }
    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        int sum=0,temp=1;

        if(inputArray.length!=0){
            for (int var:inputArray)
            {
                if(var<0)
                    temp=0;
                else
                    sum+=var;
            }
            if (temp==1)
                return "The average value is: "+String.valueOf(sum/inputArray.length);
            else
                return "Give proper positive integer values";
        }
        else
            return "Empty array";
    }
}
