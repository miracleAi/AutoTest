package com.belle.code;

import org.testng.annotations.Test;
/**
 * 忽略测试
 * */
public class IgnorTest {

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test(enabled = true)
    public void test2() {
        System.out.println("test2");
    }

    @Test(enabled = false)
    public void test3() {
        System.out.println("test3");
    }
}
