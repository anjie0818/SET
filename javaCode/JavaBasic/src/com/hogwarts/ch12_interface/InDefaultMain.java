/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch12_interface;

/**
 * 程序入口
 * 演示接口的默认方法
 */
public class InDefaultMain {
    public static void main(String[] args) {
        // 实例化实现类对象
        InDefaultMethodImpl hogwarts = new InDefaultMethodImpl();
        // 调用方法
        hogwarts.walk();
    }
}
