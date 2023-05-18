/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 子类
 * 演示多态
 */
public class MethodSon extends MethodFather {
    // 独有的方法
    public void sonEat(){
        System.out.println("Son在吃饭");
    }

    @Override
    public void run(){
        System.out.println("Son在跑步");
    }
}
