/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch02_operator;

/**
 * 自增、自减
 */
public class SelfHandle {
    public static void main(String[] args) {
        int a = 10;
        int aPlusPlus = a++;
        System.out.println("aPlusPlus:" + aPlusPlus);
        System.out.println("a:" + a);

        int b = 20;
        int plusPlusB = ++b;
        System.out.println("plusPlusB:" + plusPlusB);
        System.out.println("b:" + b);

        int c = 30;
        int cMinusMinus = c--;
        System.out.println("cMinusMinus:"+ cMinusMinus); // 30
        System.out.println("c:"+c);  // 29

        int d = 40;
        int minusMinusD = --d;
        System.out.println("minusMinusD:" + minusMinusD); // 39
        System.out.println("d:" + d); // 39

    }
}
