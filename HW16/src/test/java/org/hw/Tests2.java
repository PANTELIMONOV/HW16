package org.hw;

import org.testng.annotations.*;

public class Tests2 {
    @DataProvider(name = "data")
    public Object[][] dpMethod() {
        return new Object[][]{{" with value1"}, {" with value2"}};
    }

    @BeforeGroups(groups = "1")
    public void beforeGroup() {
        System.out.println("Before group");
    }

    @Test(dataProvider = "data")
    public void someTest4(String data) {
        System.out.println("this is 4 test" + data);
    }

    @Test(groups = "functional", dataProvider = "data")
    public void someTest5(String value) {
        System.out.println("this is 5 test" + value);
    }

    @Test(groups = "1")
    public void someTest6() {
        System.out.println("this is 6 test");
    }

    @AfterGroups(groups = "1")
    public void afterGroup() {
        System.out.println("After group");
    }
}
