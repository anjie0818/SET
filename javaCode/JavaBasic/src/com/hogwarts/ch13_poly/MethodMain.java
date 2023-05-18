/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 程序入口
 * 演示多态
 */
public class MethodMain {
    public static void main(String[] args) {
        // 多态
        MethodFather father  = new MethodSon();

        // 调用父类的独有方法
        father.fatherEat();
        // 调用父类的被重写的方法
        father.run();
        // 调用子类的独有方法
        // father.sonEat();  子类有，父类没有，无法调用
    }
}
