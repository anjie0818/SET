/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch04_loop;

/**
 * 演示continue和break的区别
 */
public class ContinueAndBreak {

    public static void main(String[] args) {
        // 打印数字
        for(int i=1; i<10; i++){
            if(i==4){
                // 控制跳出当次循环，继续执行后续循环
//                continue;
                break;
            }
            System.out.println(i);
        }
        System.out.println("结束了");

    }
}
