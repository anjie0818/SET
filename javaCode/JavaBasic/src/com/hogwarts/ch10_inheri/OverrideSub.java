/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 子类
 * 演示继承中的方法重写
 */
public class OverrideSub extends OverrideBase {
    public void live(){
        System.out.println("子类方法: 住在新家");
    }

    // 明确访问父类方法
    public void doSuper(){
        super.live();
    }
    // 明确访问自己方法
    public void doThis(){
        this.live();
    }
}
