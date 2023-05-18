/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 子类调用父类构造方法
 */
public class ConstructorSub extends ConstructorBase {
    // 显式调用super()
    public ConstructorSub(){
        super();  // 调用父类构造
        System.out.println("子类的构造方法");
    }


}
