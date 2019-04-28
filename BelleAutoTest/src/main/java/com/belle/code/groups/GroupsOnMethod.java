package com.belle.code.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 方法组测试
 * */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("test1");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("test2");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("test3");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("test4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnSever() {
        System.out.println("before group on server");
    }


    @AfterGroups("server")
    public void afterGroupsOnSever() {
        System.out.println("after group on server");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("before group on client");
    }


    @AfterGroups("client")
    public void afterGroupsOnClient() {
        System.out.println("after group on client");
    }
}
