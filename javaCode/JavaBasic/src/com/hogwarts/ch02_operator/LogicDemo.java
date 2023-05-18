/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch02_operator;

/**
 * 逻辑运算符
 */
public class LogicDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // 逻辑与 &
        System.out.println(a & b); // 同为true则得到true
        // 逻辑或 ｜
        System.out.println(a | b);  // 但凡有一个true则得到true
        // 逻辑非 !
        System.out.println(!a); // 反着来
        System.out.println(!b);
    }
}
