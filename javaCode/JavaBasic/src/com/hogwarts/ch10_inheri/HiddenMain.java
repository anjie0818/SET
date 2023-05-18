/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 程序入口
 * 演示继承中的变量隐藏
 */
public class HiddenMain {
    public static void main(String[] args) {
        // 实例化子类对象
        HiddenSub sub = new HiddenSub();

        // 访问变量
        System.out.println(sub.name);

        // 指定访问父类的变量 使用super
        sub.showSuper();

        // 指定访问子类的变量 使用this
        sub.showThis();
    }
}
