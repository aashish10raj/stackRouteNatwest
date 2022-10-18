package com.natwest.learning.basic;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        try {
            int x = 20 / 0;
            System.out.println(x);
            int arr[] = new int[5];
            arr[5] = 60;
      } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
//
//        catch (ArithmeticException e){
//            System.out.println("Exception1 : "+e);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception2 : "+e);
   //     }

       // Finally block will execute with the exception.
        finally {
            System.out.println("Output -----------");


        }

    }
}
