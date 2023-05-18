/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch09_constructors;

/**
 * Student类
 */
public class Student {
    // 成语变量
    private String name;
    private int grade;

    // 无参构造方法
    public Student(){
        System.out.println("没有参数");
    }

    // 一个参数的构造方法
    public Student(String name){
        System.out.println("只有一个参数");
        this.name = name;
    }

    // 两个参数的构造方法
    public Student(String name, int grade){
        System.out.println("有两个参数");
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
