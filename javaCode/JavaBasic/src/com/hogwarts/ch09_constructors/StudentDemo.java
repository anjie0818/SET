/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch09_constructors;

/**
 * 程序入口
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println("=============");

        Student student1 = new Student("hogwarts");
        System.out.println(student1.getName());
        System.out.println("=============");

        Student student2 = new Student("hogwarts2", 666);
        System.out.println(student2.getName());
        System.out.println(student2.getGrade());

    }
}
