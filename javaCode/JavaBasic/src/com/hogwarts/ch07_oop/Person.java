/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch07_oop;

/**
 * Person类
 */
public class Person {

    // 属性
    Integer height;  // 身高
    String  name;  // 姓名
    Integer age;  // 年龄

    // 构造方法
    public Person(){
        // 初始化对象
    }

    // 行为
    public void sleep(){
        System.out.println("睡觉了");
    }

    public void eat(){
        System.out.println("吃饭了");
    }

    public void meet(String meetPersonName){
        System.out.println(name + "遇见了" + meetPersonName);
    }


}
