/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch06_method;

/**
 * 方法重载：overload
 */
public class MethodOverload {

    // 需要计算2个数字的和值
    public static int sum(int a, int b){
        System.out.println("有2个参数参加");
        return a+b;
    }

    // 需要计算3个数字的和值
    public static int sum(int d, float e){
        System.out.println("有3个参数参加");
        if(d>1){
            return 5;
        }else{
            return (int)(d+e);
        }
    }

    public static void main(String[] args) {
        sum(5, 10);
        sum(5, 3.5f);
    }

}
