package org.natwest.learning.objectdemo;

public class HashCodeExample {
    public static void main(String[] args) {
        Integer obj=new Integer(1111);
        int hashValue=obj.hashCode();
        System.out.println("HashCode = "+hashValue);
    }
}
