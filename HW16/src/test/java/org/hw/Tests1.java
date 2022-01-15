package org.hw;

import org.testng.annotations.*;

public class Tests1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @Test
    public void someTest1() {
        System.out.println("this is 1 test");
    }

    @Test(groups = "functional")
    public void someTest2() {
        System.out.println("this is 2 test");
    }

    @Test(groups = "functional")
    public void someTest3() {
        System.out.println("this is 3 test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }
}
