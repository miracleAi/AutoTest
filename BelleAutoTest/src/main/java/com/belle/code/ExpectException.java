package com.belle.code;

import org.testng.annotations.Test;

/**
 * 异常测试
 * */

public class ExpectException {
    /**
     * 什么时候会用到异常测试
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是说我的预期结果就是这个异常
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFail() {
        System.out.println("这是一个运行失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuc() {
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
