/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch10_inheri;

/**
 * 父类
 * 演示继承的规则
 */
public class RuleBase {
    public String name;  // 公共开的
    private int money;  // 私有的

    // 父类公开方法
    public void eat(){
        System.out.println(this.name + "在吃饭");
    }
    // 父类私有方法
    private void showMoney(){
        System.out.println(this.money + "元钱");
    }
}
