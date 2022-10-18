package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public App app;
    public StringManipulation sm;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testAdd(){
        app=new App();
        int sum=app.addSum(20,30);
        assertEquals(50,sum);
    }

    public void testIsEven()
    {
        app=new App();
        boolean even=app.isEven(22);
        assertTrue(even);
    }
    public void testVowelCount(){
        sm=new StringManipulation();
        int c=sm.vowelCount("account");
        assertEquals(c, 3);

    }
    public void testCharacterCount(){
        sm=new StringManipulation();
        int c = sm.characterCount("test");
        assertEquals(4, c);
    }
}
