package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnderGraduateTests {
    UnderGraduate uStudent1, uStudent2;

    @BeforeEach
    void setUp() {
        uStudent1 = new UnderGraduate(3, "three", 90, 20, "uvw");
        uStudent2 = new UnderGraduate(4, "four", 50, 20, "ijk");
    }

    @AfterEach
    void tearDown() {
        uStudent1 = null;
        uStudent2 = null;
    }

    @Test
    void testToString() {
        String exp1 = "Student{" +
                "studentId=" + uStudent1.getStudentId() +
                ", name='" + uStudent1.getName() + '\'' +
                ", grade=" + uStudent1.getGrade() +
                ", age=" + uStudent1.getAge() +
                ", address='" + uStudent1.getAddress() + '\'' +
                '}' + " Passed=" + uStudent1.isPassed(uStudent1.getGrade());
        assertEquals(exp1, uStudent1.toString());
        String exp2 = "Student{" +
                "studentId=" + uStudent2.getStudentId() +
                ", name='" + uStudent2.getName() + '\'' +
                ", grade=" + uStudent2.getGrade() +
                ", age=" + uStudent2.getAge() +
                ", address='" + uStudent2.getAddress() + '\'' +
                '}' + " Passed=" + uStudent2.isPassed(uStudent2.getGrade());
        assertEquals(exp2, uStudent2.toString());
    }

    @Test
    void testSubType() {
        assertTrue(uStudent1 instanceof Student);
        assertTrue(uStudent2 instanceof Student);
    }

    @Test
    void testNotNull() {
        assertNotNull(uStudent1, "Object is not created successfully");
    }

    @Test
    void testNull() {
        uStudent2 = null;
        assertNull(uStudent2, "Object is not created successfully");
    }
}