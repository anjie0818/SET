/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch03_condition;

/**
 * switch 语句
 */
public class SwitchDemo {
    public static void main(String[] args) {
        // 变量
        int weekday = 3;
        // switch 逻辑
        switch (weekday){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;

            default:
                System.out.println("周末");
                break;
        }
    }
}
