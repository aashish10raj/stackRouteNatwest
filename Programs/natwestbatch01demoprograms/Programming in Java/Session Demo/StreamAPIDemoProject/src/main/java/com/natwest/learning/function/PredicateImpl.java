package com.natwest.learning.function;

import java.util.function.Predicate;

public class PredicateImpl {
//    public boolean test(int i){
//        if(i%2==0)
//            return true;
//            else
//                return false;
//    }

    public static void main(String[] args) {
//        PredicateImpl predicate=new PredicateImpl();
//        boolean b= predicate.test(8);
//        System.out.println(b);
        // Predicate Interface
//        Predicate<Integer> predicate=(Integer integer)->{
//            return integer%2==0;
//        };
        Predicate<Integer> predicate=(Integer integer)->integer%2==0;

        boolean b = predicate.test(5);
        System.out.println(b);
    }
}

