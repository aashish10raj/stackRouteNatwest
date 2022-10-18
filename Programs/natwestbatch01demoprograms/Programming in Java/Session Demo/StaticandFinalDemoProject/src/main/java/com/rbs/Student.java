package com.rbs;

public class Student {
    private int studentId;
    private String name;
    private static String college="BMSIT";

    static void change(){
        college="RNSIT";
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void display(){
        System.out.println("Student ID : "+studentId+" : "+"Name = "+name+" : "+college);
    }
}
