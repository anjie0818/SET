/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 实现类
 * 演示向下转型
 */
public class DownWorker implements Person {

    @Override
    public void run() {
        System.out.println("Worker正在跑步");
    }

    public void work(){
        System.out.println("Worker正在工作");
    }
}
