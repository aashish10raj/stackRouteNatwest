package com.natwest.relationship;

class StudentImpl{
    public static void main(String[] args) {
        Address address=new Address("Bangalore","Karnataka",560010);
        Student student=new Student(1,"John",address);
        System.out.println("Student ID = "+student.getStudentId());
        System.out.println("Student Name = "+student.getName());
        System.out.println("Student Address = "+student.getAddress());
    }
}

public class Student {
    private int studentId;
    private String name;
    private Address address; // has-a

    public Student(int studentId, String name, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

