package com.belle.code;

import org.testng.annotations.Test;

/**
 * 依赖测试
 * */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    //test2 的运行依赖于test1.执行test2时会先执行test1,弱test1失败，则test2不执行
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
