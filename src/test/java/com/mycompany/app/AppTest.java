package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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
    public void testFound(){
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(54,63,72,99));
	assertTrue(new App().search(array,8,9));
    }
    public void testNotFound(){
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(54,63,72,99));
	assertFalse(new App().search(array,8,10));
    }
    public void testEmptyArray(){
	ArrayList<Integer> array = new ArrayList<>();
	assertFalse(new App().search(array,8,10));
    }
    public void testNull(){
	assertFalse(new App().search(null,8,10));
    }
    public void oneNegative(){
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(54,63,72,-99));
	assertTrue(new App().search(array,-9,11));
    }
    public void twoNegatives(){
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(54,63,72,-99));
	assertTrue(new App().search(array,-9,8));
    }



















}
