package com.belle.code.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void tea1(){
        System.out.println("group3 tea1");
    }

    public void tea2(){
        System.out.println("group3 tea2");
    }
}
