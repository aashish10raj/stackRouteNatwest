package com.rbos;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    void setUpOnce(){
        System.out.println("Inside @BeforeAll");
    }

    @BeforeEach
    void setUp() {
        // Arrange
        calculator=new Calculator();
        System.out.println("Inside @BeforeEach");
    }
    @Test
    void testAddTwoIntegerNumber() {
        // Act
        int sum=calculator.add(10,20);
        // Assertion
        assertEquals(30,sum);
        System.out.println("Inside@testAddTwoIntegerNumber");
    }

    @Test
    void testAddFailedTwoIntegerNumber() {
        // Act
        int sum=calculator.add(10,20);
        // Assertion
        assertEquals(20,sum);
    }

    @Test
    void testSubtractTwoIntegerNumber() {
        int subtract= calculator.subtract(50,25);
        assertEquals(25,subtract);
        System.out.println("Inside@testSubtractTwoIntegerNumber");
    }
    @Disabled
    @Test
    void testMultiplyTwoIntegerNumber(){
        int product=calculator.multiply(10,5);
        assertEquals(50,product);
        System.out.println("Inside@testMultiplyTwoIntegerNumber");
    }



    @AfterEach
    void tearDown() {
        calculator=null;
        System.out.println("Inside@AfterEach");
    }
    @AfterAll
    void tearDownOnce(){
        System.out.println("Inside@AfterAll");
    }


}