/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch09_constructors;

/**
 * 程序入口
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("没有构造方法的情况");
        StudentDefault hogwarts = new StudentDefault();
        System.out.println(hogwarts.getName());
        System.out.println(hogwarts.getGrade());
        System.out.println("================");

        StudentNoArgs noArgs = new StudentNoArgs();
        System.out.println(noArgs.getName());
        System.out.println(noArgs.getGrade());
        System.out.println("================");

        StudentWithArgs withArgs = new StudentWithArgs("hogwarts", 666);
        System.out.println(withArgs.getName());
        System.out.println(withArgs.getGrade());


    }
}
