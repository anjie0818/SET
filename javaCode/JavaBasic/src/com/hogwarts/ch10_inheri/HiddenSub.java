/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 子类
 * 演示继承中的变量隐藏
 */
public class HiddenSub extends HiddenBase{

    // 子类重名的变量，会导致父类重名变量被隐藏
    public String name = "子类的name变量";

    public void showSuper(){
        System.out.println("super:" + super.name);
    }
    public void showThis(){
        System.out.println("this:" + this.name);
    }

}
