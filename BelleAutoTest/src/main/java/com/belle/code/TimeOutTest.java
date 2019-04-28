package com.belle.code;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)
    public void timeOutTest() throws InterruptedException {
        System.out.println("time out test suc");
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void timeOutTestFail() throws InterruptedException {
        System.out.println("time out test fail");
        Thread.sleep(3000);
    }
}
