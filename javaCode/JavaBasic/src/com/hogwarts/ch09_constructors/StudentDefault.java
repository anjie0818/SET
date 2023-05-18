/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch09_constructors;

/**
 * 默认构造方法
 */
public class StudentDefault {
    // 声明成员变量
    private String name;
    private int grade;

    // 没有构造方法，系统会自动提供一个默认的构造方法

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
