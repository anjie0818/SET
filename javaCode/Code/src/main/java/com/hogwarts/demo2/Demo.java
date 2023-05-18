/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.demo2;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        // 如果 private，可以通过get 方法访问
        System.out.println(student.getName());
        // 也可以通过 set 方法修改
        student.setName("hogwarts");
        System.out.println("=======");
        System.out.println(student.getName());
    }
}
