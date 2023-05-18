/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 父类：人类
 */
public class Person {
    // 父类公开的成员变量
    public String name;

    // 父类的公开的成员方法
    public void eat(){
        System.out.println(this.name + "在吃饭");
    }

}
