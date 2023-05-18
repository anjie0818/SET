/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch01_dataTypes;

/**
 * 自动类型转换
 */
public class SilentTrans {
    public static void main(String[] args) {

        // char类型
        char c1 = 'A';
        int myInt = c1;
        System.out.println(myInt);

        // char参与运算，会自动转成int类型
        char c2 = 'a';
        int myInt2 = c2 + 2;
        System.out.println(myInt2);

        // short类型参与运算
        short sh = 6;
        System.out.println(sh + 2);

    }
}
