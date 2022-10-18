package com.natwest.learning.orderedcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cart=new ArrayList<>(); // Digital Cart
        System.out.println("Initial size of cart = "+cart.size());

        // adding elements in a cart
        cart.add("Dell Laptop");
        cart.add("Logitech Mouse");
        cart.add("Sony Headphone");
        cart.add("Bourn Bourn");
        cart.add("Dairy Milk");
        System.out.println("--------------------------------------------------------------------------------------------------");
        // Get the size
        System.out.println("Size of cart = "+cart.size());
        System.out.println("--------------------------------------------------------------------------------------------------");
        for(String product: cart){
            System.out.println("Items = "+product);
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
        // Search for a element
        System.out.println("Item = "+cart.get(2));
        System.out.println("--------------------------------------------------------------------------------------------------");
        // update element
        cart.set(1, "Lenvo wireless mouse");
        // Iterator Interface
        Iterator<String> itr= cart.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
        // deleting element in a cart
        cart.remove(2);
        cart.remove("Bourn Bourn");
        for(String product: cart){
            System.out.println(product);
        }



    }
}
