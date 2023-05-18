/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch04_loop;

/**
 * do-while 循环语句
 * 打印数字1-9
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        // 初始化变量i
        int i = 11;
        // do-while逻辑
        do{
            // 打印i
            System.out.println(i);
            // 自增操作
            i++;
        }while(i<10);
    }
}
