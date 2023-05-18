/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 程序入口
 * 演示多态之变量
 */
public class VarMain {
    public static void main(String[] args) {
        // 多态
        VarFather father  = new VarSon();
        // 访问成员变量
        System.out.println(father.name);  // Father
        // 优先查找父类
        System.out.println(father.age);  // 99
        // 访问子类独有的变量（不可以）
        // System.out.println(father.gender);  // 无法访问
        System.out.println("============");

        System.out.println(father.getAge());  // 10
    }
}
