/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 程序入口
 * 演示继承中的方法重写
 */
public class OverrideMain {
    public static void main(String[] args) {
        // 实例化子类对象
        OverrideSub sub = new OverrideSub();

        // 访问子类重写后的live方法
        sub.live();

        sub.doSuper();
        sub.doThis();
    }
}
