/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

package com.ceshiren.util;

public class Calculator {
    public static int result = 0;

    public static int add(int x ,int y ) throws InterruptedException {
        result = x+y;
        Thread.sleep(1000);
        return result;
    }
}
