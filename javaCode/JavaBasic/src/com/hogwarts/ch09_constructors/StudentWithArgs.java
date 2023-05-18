/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch09_constructors;

/**
 * 有参构造方法
 */
public class StudentWithArgs {
    // 声明成员变量
    private String name;
    private int grade;

    // 有参构造方法
    public StudentWithArgs(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

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
