/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch07_oop;

/**
 * 对象的演示
 * 创建：类名 对象名 = new 类名();
 * 访问属性：对象名.成员变量;
 * 访问方法：对象名.成员方法();
 */
public class PersonDemo {
    public static void main(String[] args) {
        // 通过Person类创建张三对象
        Person zhangSan = new Person();
        // 赋值
        zhangSan.name = "张三";
        zhangSan.height = 180;
        zhangSan.age = 30;
        System.out.println(zhangSan.name);

        // 访问方法
        zhangSan.eat();

        zhangSan.meet("李四");



    }
}
