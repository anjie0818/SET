/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch13_poly;

/**
 * 程序入口
 * 演示向下转型
 */
public class DownMain {
    public static void main(String[] args) {
        // 多态（父类引用指向子类，向上转型）
        Person person = new DownWorker();
        person.run();

        System.out.println( person instanceof DownWorker);

        // 多态（子类引用指向父类，向下转型）
        if(person instanceof DownWorker){
            DownWorker worker = (DownWorker) person;
            worker.work();
            worker.run();
        }
    }
}
