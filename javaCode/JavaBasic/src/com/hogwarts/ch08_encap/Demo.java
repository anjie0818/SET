/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch08_encap;

/**
 * 程序入口
 */
public class Demo {
    public static void main(String[] args) {
        // 创建student实例对象
        Student student = new Student();
        // 通过对象访问成员方法
        student.setName("hogwarts");
        System.out.println(student.getName());
    }
}
