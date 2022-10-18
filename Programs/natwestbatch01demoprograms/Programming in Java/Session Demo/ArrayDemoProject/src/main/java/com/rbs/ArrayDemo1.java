package com.rbs;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // Creating an Integer Array
           int[] myArray=new int[5];

           // Array Initialization

            myArray[0]=10;
            myArray[1]=20;
            myArray[2]=30;
            myArray[3]=40;
            myArray[4]=50;
      //      myArray[5]=60;  // ArrayIndexOutOfBoundsException

        // traverse the array
           for (int i=0; i<myArray.length; i++){
               System.out.println("Element at Index : "+i+" : "+myArray[i]);
           }
    }
}
