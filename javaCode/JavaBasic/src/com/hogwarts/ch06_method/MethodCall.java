/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch06_method;

/**
 * 方法的调用
 */
public class MethodCall {
    // 计算求和
    public static int sum(int a, int b){
        // 方法体
        System.out.println("方法开始执行啦！");
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        // 直接调用
        sum(5, 10);
        System.out.println("===========");

        // 打印调用
        System.out.println(sum(5, 10));

        // 赋值调用
        System.out.println("=========");
        int number = sum(5, 10);
    }




}
