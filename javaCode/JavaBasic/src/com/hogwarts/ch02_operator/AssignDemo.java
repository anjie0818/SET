/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch02_operator;

/**
 * 赋值运算符
 */
public class AssignDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int e = 10;

        a += 2;  // a = a+ 2;
        System.out.println("a:"+ a);

        b -= 2; // b = b - 2;
        System.out.println("b:" + b);

        c *= 2;  // c = c * 2;
        System.out.println("c:" + c);

        d /= 2; // d = d / 2;
        System.out.println("d:" + d);

        e %= 4;  // e = e % 4;
        System.out.println("e:" + e);
    }
}
