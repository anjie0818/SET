/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 父类
 * 演示多态
 */
public class MethodFather {
    // 独有
    public void fatherEat(){
        System.out.println("Father在吃饭");
    }

    // 将被重写的
    public void run(){
        System.out.println("Father在跑步");
    }
}
