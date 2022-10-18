package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostGraduateTests {

    PostGraduate pStudent1, pStudent2;

    @BeforeEach
    void setUp() {
        pStudent1 = new PostGraduate(3, "three", 90, 20, "uvw");
        pStudent2 = new PostGraduate(4, "four", 50, 20, "ijk");
    }

    @AfterEach
    void tearDown() {
        pStudent1 = null;
        pStudent2 = null;
    }

    @Test
    void testToString() {
        String exp1 = "Student{" +
                "studentId=" + pStudent1.getStudentId() +
                ", name='" + pStudent1.getName() + '\'' +
                ", grade=" + pStudent1.getGrade() +
                ", age=" + pStudent1.getAge() +
                ", address='" + pStudent1.getAddress() + '\'' +
                '}' + " Passed=" + pStudent1.isPassed(pStudent1.getGrade());
        assertEquals(exp1, pStudent1.toString());
        String exp2 = "Student{" +
                "studentId=" + pStudent2.getStudentId() +
                ", name='" + pStudent2.getName() + '\'' +
                ", grade=" + pStudent2.getGrade() +
                ", age=" + pStudent2.getAge() +
                ", address='" + pStudent2.getAddress() + '\'' +
                '}' + " Passed=" + pStudent2.isPassed(pStudent2.getGrade());
        assertEquals(exp2, pStudent2.toString());
    }

    @Test
    void testSubType() {
        assertTrue(pStudent1 instanceof Student);
        assertTrue(pStudent2 instanceof Student);
    }

    @Test
    void testNotNull() {
        assertNotNull(pStudent1, "Object is not created successfully");
    }

    @Test
    void testNull() {
        pStudent2 = null;
        assertNull(pStudent2, "Object is not created successfully");
    }
}