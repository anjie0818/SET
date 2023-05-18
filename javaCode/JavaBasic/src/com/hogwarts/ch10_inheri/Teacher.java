/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 子类：教师类
 */
public class Teacher extends Person {

    // 成员方法：上课
    public void teach(){
        System.out.println(this.name + "在讲课");
    }
}