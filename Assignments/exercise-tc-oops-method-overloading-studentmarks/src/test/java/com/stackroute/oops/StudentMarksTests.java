package com.stackroute.oops;

import org.junit.jupiter.api.*;

import java.util.*;

class StudentMarksTests {

    StudentMarks marks;

    @BeforeEach
    void setUp(){
        marks=new StudentMarks();
    }


    @Test
    public void calculateMarksWithThreeIntegers()
    {
        int result=marks.calculateMarks(10,15,10);
        int expected=35;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void calculateMarksWithFourIntegers()
    {
        int result=marks.calculateMarks(10,15,10,15);
        int expected=50;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void calculateMarksWithFourDoubles()
    {
        double result=marks.calculateMarks(10.0,15.2,10.4,15.4);
        double expected=51;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void calculateMarksWithFourFloats()
    {
        float result=marks.calculateMarks(10.0f,15.2f,10.4f,15.4f);
        float expected=51;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void calculateMarksWithFiveFloats()
    {
        float result=marks.calculateMarks(10.0f,15.2f,10.4f,15.4f,16);
        float expected=67;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void classifyStudentGradeWithList()
    {
        List arr= Arrays.asList(10,20,40,80);
        String expected="GRADE B";
        String result=marks.classifyStudentGrade(arr);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void classifyStudentGradeWithSet()
    {
        Set<Integer> arr=new HashSet<Integer>();
        arr.addAll(Arrays.asList(10,40,60,98));
        String expected="GRADE A";
        String result=marks.classifyStudentGrade(arr);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void classifyStudentGradeWithCollections()
    {
        Collection<Integer> arr= new Vector<Integer>();
        arr.addAll(Arrays.asList(10,89,90));
        String expected="None";
        String result=marks.classifyStudentGrade(arr);
        Assertions.assertEquals(expected,result);
    }

    @AfterEach
    void tearDown(){
        marks=null;
    }
}