/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch04_loop;

/**
 * 嵌套for循环语句
 * 打印九九乘法表
 */
public class ForLoopNested {
    public static void main(String[] args) {
        // 嵌套for循环
        // 定义i表示行数
        for(int i=1; i<=9; i++){
            // 定义j表示列数
            for(int j=1; j<=i; j++){
                // 打印算式
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            // 强制换行（当j大于i的时候）
            System.out.println();

        }
    }

}
