/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch12_interface;

/**
 * 接口实现类
 * 演示接口的默认方法
 */
public class InDefaultMethodImpl implements InDefaultMethod{
    @Override
    public void walk() {
        // win: alt+insert
        // mac: command + N
        InDefaultMethod.super.walk();
    }
}
