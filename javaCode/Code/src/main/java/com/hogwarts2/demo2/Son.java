/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts2.demo2;

// Son.java
public class Son extends Father{
    // 重写父类的run 方法
    @Override
    public void run(){
        System.out.println("儿子跑步");
    }
    // 子类独有的方法
    public void sonEat(){
        System.out.println("儿子吃饭");
    }
}
