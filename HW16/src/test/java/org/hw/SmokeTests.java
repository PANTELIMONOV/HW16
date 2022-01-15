package org.hw;

import org.testng.annotations.*;

public class SmokeTests {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @Test
    public void someTest7() { System.out.println("this is 7 test"); }

    @Test(groups = "functional")
    public void someTest8() {
        System.out.println("this is 8 test");
    }

    @Test
    public void someTest9() {

        System.out.println("this is 9 test");
    }
}
