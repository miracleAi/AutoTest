package com.belle.code.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化测试
 * xml文件传递参数
 * */
public class ParameterTest {

    @Test
    @Parameters({"name", "age"})
    public void paramTest(String name, int age) {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
    }
}
