/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch07_oop;

import java.util.Arrays;

/**
 * 程序入口
 * 打印姓名数组：[张三, 李四, 王五]
 */
public class Main {
    public static void main(String[] args) {
        // 声明姓名数组
        String[] nameArray = {"张三", "李四", "王五"};
        // 直接打印
        System.out.println(nameArray);
        // 面向过程：使用for循环打印
        System.out.print("[");  // 打印中括号
        for(int i=0; i< nameArray.length; i++){
            System.out.print(nameArray[i]);
            if(i != nameArray.length -1){
                System.out.print(", ");  // 拼接逗号
            }else{
                System.out.print("]");  // 打印中括号
            }

        }
        System.out.println();

        // 利用面向对象思想，打印
        System.out.println(Arrays.toString(nameArray));
    }
}
