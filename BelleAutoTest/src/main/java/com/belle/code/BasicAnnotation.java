package com.belle.code;

import org.testng.annotations.*;

public class BasicAnnotation {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @Test
    public void testCase1() {
        System.out.println("test1");
    }


    @Test
    public void testCase2() {
        System.out.println("test2");
    }

    @AfterMethod
    public void afterMEthod() {
        System.out.println("after method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }
}
