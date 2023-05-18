/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 程序入口
 * 演示多态
 */
public class Demo {
    public static void main(String[] args) {
        // 正常的写法
        Son son = new Son();
        son.eat();

        // 多态的写法：父类引用指向子类对象
        Father father = new Son();
        father.eat();

    }
}
