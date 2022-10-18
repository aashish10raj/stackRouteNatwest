package com.stackroute.oops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTests {
    static UnderGraduate uStudent1,uStudent2;
    static{
        uStudent1 = new UnderGraduate(1,"one",10,20,"xyz");
        uStudent2 = new UnderGraduate(2,"two",80,20,"abc");
    }
    @Test
    void getStudentId() {
        assertEquals(1,uStudent1.getStudentId());
        assertEquals(2,uStudent2.getStudentId());
    }

    @Test
    void getName() {
        assertEquals("one",uStudent1.getName());
        assertEquals("two",uStudent2.getName());
    }

    @Test
    void getGrade() {
        assertEquals(10,uStudent1.getGrade());
        assertEquals(80,uStudent2.getGrade());
    }

    @Test
    void getAge() {
        assertEquals(20,uStudent1.getAge());
        assertEquals(20,uStudent2.getAge());
    }

    @Test
    void getAddress() {
        assertEquals("xyz",uStudent1.getAddress());
        assertEquals("abc",uStudent2.getAddress());
    }

    @Test
    void testToString() {
        String exp1 = "Student{" +
                "studentId=" + uStudent1.getStudentId() +
                ", name='" + uStudent1.getName() + '\'' +
                ", grade=" + uStudent1.getGrade() +
                ", age=" + uStudent1.getAge() +
                ", address='" + uStudent1.getAddress() + '\'' +
                '}'+" Passed=" + uStudent1.isPassed(uStudent1.getGrade());
        String exp2 = "Student{" +
                "studentId=" + uStudent2.getStudentId() +
                ", name='" + uStudent2.getName() + '\'' +
                ", grade=" + uStudent2.getGrade() +
                ", age=" + uStudent2.getAge() +
                ", address='" + uStudent2.getAddress() + '\'' +
                '}'+" Passed=" + uStudent2.isPassed(uStudent2.getGrade());
        assertEquals(exp1,uStudent1.toString());
        assertEquals(exp2,uStudent2.toString());
    }

    @Test
    void isPassed() {
        assertFalse(uStudent1.isPassed(uStudent1.getGrade()));
        assertTrue(uStudent2.isPassed(uStudent2.getGrade()));
    }
}