/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.demo3;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        // 子类可以直接访问父类中的属性name
        System.out.println(student.name);
        //子类和父类的成员变量gender重名，会优先访问子类
        System.out.println(student.gender);
        //父类如果使用 private 修饰成员变量，子类则不能直接访问
//        System.out.println(person.age);
    }
}