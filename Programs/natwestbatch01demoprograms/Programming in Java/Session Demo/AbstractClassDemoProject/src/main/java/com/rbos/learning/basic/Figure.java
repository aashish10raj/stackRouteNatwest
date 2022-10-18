package com.rbos.learning.basic;

class AbstractDemoImpl{
    public static void main(String[] args) {
        Figure figure;
        figure=new Square();
        figure.area();
        figure.perimeter();
        System.out.println("------------------------------------------------------");
        figure=new Rectangle();
        figure.area();
        figure.perimeter();
    }
}

public abstract class Figure {
    String color;
    // Non-Abstract Method
    public void display(){
        System.out.println("Geometrical Figure");
    }
    // Abstract Method
    abstract void area();
    abstract void perimeter();
}
class Square extends Figure{
    int a=4;
    void area() {
        System.out.println("Area of Square = "+a*a);
    }

    void perimeter() {
        System.out.println("Perimeter of Square = "+4*a);
    }
}
class Rectangle extends Figure{

    int l=5, b=6;

    void area() {
        System.out.println("Area of Rectangle = "+l*b);
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle = "+2*(l+b));

    }
}

