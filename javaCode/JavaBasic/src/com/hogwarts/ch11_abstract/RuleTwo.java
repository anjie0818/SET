/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch11_abstract;

/**
 * 规则2
 */
public abstract class RuleTwo {
    // 成员变量
    public String color;

    // 构造方法
    public RuleTwo(){
        System.out.println("抽象类的构造方法");
        color = "白色";
    }
}
