/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts3;

public class Student implements Person {
    @Override
    public void run() {
        System.out.println("Student跑步");
    }
    public void study(){
        System.out.println("学习");
    }
}
