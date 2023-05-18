/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 子类
 * 演示多态之变量
 */
public class VarSon extends VarFather {
    public int age = 10;
    public String gender = "male";

    @Override
    public int getAge(){
        return age;
    }
}
