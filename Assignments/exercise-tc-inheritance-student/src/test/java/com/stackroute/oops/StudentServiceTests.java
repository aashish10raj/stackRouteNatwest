package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTests {
    StudentService service1,service2;
    @Test
    void createUnderGraduateStudent() {
        Student us1 = service1.createUnderGraduateStudent(3, "three", 90, 20, "uvw");
        assertEquals(3,us1.getStudentId());
        assertEquals("three",us1.getName());
        assertEquals(90,us1.getGrade());
        assertEquals(20,us1.getAge());
        assertEquals("uvw",us1.getAddress());
        Student us2 = service2.createUnderGraduateStudent(4, "four", 61, 20, "uvw");
        assertEquals(4,us2.getStudentId());
        assertEquals("four",us2.getName());
        assertEquals(61,us2.getGrade());
        assertEquals(20,us2.getAge());
        assertEquals("uvw",us2.getAddress());
    }

    @Test
    void createPostGraduateStudent() {
        Student ps1 = service1.createPostGraduateStudent(3, "three", 90, 20, "uvw");
        assertEquals(3,ps1.getStudentId());
        assertEquals("three",ps1.getName());
        assertEquals(90,ps1.getGrade());
        assertEquals(20,ps1.getAge());
        assertEquals("uvw",ps1.getAddress());
    }

    @BeforeEach
    void setUp() {
        service1 = new StudentService();
        service2 = new StudentService();
    }

    @AfterEach
    void tearDown() {
        service1 = null;
        service2 = null;
    }
}