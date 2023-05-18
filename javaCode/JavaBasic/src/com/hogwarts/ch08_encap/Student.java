/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch08_encap;

/**
 * 学生类
 */
public class Student {
    // private 表示最小权限，私有的
    private String name;
    private int age;
    private String gender;

    // name:getter方法
    public String getName(){
        // this.调用成员方法
        this.show();
        return this.name;
    }
    // name:setter方法
    public void setName(String name){
        // this.访问成员变量
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    // 定义一个成员方法show
    public void show(){
        System.out.println("这是成员方法");
    }
}
