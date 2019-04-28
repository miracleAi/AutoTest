package com.belle.code.multithread;

import org.testng.annotations.Test;

public class MulitiThreadOnXml {


    @Test
    public void test1(){
        System.out.printf("test1 Thread id : %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("test2 Thread id : %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3 Thread id : %s%n", Thread.currentThread().getId());
    }
}
