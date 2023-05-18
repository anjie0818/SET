/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch07_oop;

/**
 * 基本类型实例
 */
public class BasicTypeTest {
    public static void main(String[] args) {
        // 创建对象
        BasicType demo = new BasicType();
        // 访问对象的成员变量
        System.out.println(demo.byteX);
        System.out.println(demo.shortX);
        System.out.println(demo.intX);
        System.out.println(demo.longX);
        System.out.println(demo.doubleX);

        // 访问对象的引用类型变量
        System.out.println(demo.person);
        System.out.println(demo.name);
    }
}
