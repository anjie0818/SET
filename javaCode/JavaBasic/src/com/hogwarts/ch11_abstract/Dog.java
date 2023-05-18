/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch11_abstract;

/**
 * 子类：小狗类
 */
public class Dog extends Animals{
    // 具体子类中重写抽象方法
    @Override
    public void eat(){
        System.out.println("小狗狗吃狗粮");
    }

}
