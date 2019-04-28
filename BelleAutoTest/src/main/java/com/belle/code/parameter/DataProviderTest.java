package com.belle.code.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    /**
     * 普通参数传递
     * */

    @Test(dataProvider = "data")
    public void dataProviderTest(String name, int age) {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] provideData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 20},
                {"lisi", 18}
        };
        return o;
    }

    /**
     *根据方法名传递参数
     * */

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test111  name=" + name + "   " + "age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test222  name=" + name + "   " + "age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataProvide(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 21},
                    {"lisi", 19}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"wangwu", 30},
                    {"zhaoliu", 35}
            };
        }
        return result;
    }
}
