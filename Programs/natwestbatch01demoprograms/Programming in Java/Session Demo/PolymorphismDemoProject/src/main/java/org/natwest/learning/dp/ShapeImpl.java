package org.natwest.learning.dp;

public class ShapeImpl {
    public static void main(String[] args) {
        Shape shape;
        shape=new Triangle("Blue",10,15);
        System.out.println(shape.calculateArea());
        shape=new Rectangle("Red",25,10);
        System.out.println(shape.calculateArea());
    }
}
