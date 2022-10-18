package org.natwest.learning.dp;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    public double calculateArea(){
        System.out.println("Shape unknown ! Can't compute area");
        return 0;
    }
}
class Triangle extends Shape{
    private int base,height;

    public Triangle(String color,int base, int height) {
        super(color);
        this.base=base;
        this.height=height;
    }
    public double calculateArea(){
        return 0.5*base*height;
    }
}
class Rectangle extends Shape{
    private int length, breadth;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
