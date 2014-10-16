/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.voskhod.junitmavenapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Exorcist
 */
public class AppTest {
    
    public AppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class App.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        short a = 4;
        short b = 5;
        App instance = new App();
        int expResult = 9;
        long result = instance.sum(a, b);
        assertEquals(expResult, result);
    }
    
}
