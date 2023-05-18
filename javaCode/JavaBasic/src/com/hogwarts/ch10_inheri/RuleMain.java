/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 程序入口
 * 演示继承的规则
 */
public class RuleMain {
    public static void main(String[] args) {
        // 实例化子类对象
        RuleSub sub = new RuleSub();

        sub.name = "子类";
        sub.eat();
    }
}
