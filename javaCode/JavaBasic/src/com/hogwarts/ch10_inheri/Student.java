/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 子类：学生类
 */
public class Student extends Person {

    // 学生类的成员方法：学习
    public void study(){
        System.out.println(this.name + "在学习");
    }
}
