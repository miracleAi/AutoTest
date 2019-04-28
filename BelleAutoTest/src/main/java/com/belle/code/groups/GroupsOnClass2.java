package com.belle.code.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1() {
        System.out.println("group2 stu1");
    }

    public void stu2() {
        System.out.println("group2 stu2");
    }

}
