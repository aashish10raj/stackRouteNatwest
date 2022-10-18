package org.natwest.learning.dp;

class ProgramImpl{
    public static void main(String[] args) {
        Parent parent;
        parent=new Child1(); // Dynamic Polymorphism
        parent.calculate(10,20); // 200
        parent=new Child2();
        parent.calculate(100,25);
    }
}

public class Parent {
     void calculate(int num1, int num2){
        System.out.println(num1+num2);
    }
}
class Child1 extends Parent{
    @Override
   public void calculate(int num1, int num2){
        System.out.println(num1*num2);
    }
}
class Child2 extends Parent{
    @Override
    public void calculate(int num1, int num2){
        System.out.println(num1/num2);
    }
}