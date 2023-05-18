/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch03_condition;

/**
 * if-else if 语句
 */
public class IfElseIf {
    public static void main(String[] args) {
        // 分数
        int hogwarts = 59;
        // if...else if...else 逻辑
        if(hogwarts >=80){
            System.out.println("优秀");
        }else if(hogwarts >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
