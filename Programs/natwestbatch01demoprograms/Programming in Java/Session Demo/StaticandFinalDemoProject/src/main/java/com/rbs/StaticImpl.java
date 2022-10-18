package com.rbs;

public class StaticImpl {
    public static void main(String[] args) {
        Student.change();
        Student student1=new Student(1, "Sam");
        Student student2=new Student(2,"Peter");
        student1.display();
        student2.display();
    }
}
