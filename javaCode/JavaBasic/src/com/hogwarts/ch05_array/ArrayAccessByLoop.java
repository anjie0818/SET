/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch05_array;

/**
 * 数组遍历 for
 */
public class ArrayAccessByLoop {
    public static void main(String[] args) {
        // 声明并初始化数组
        int[] arr = {15, 25, 30, 40, 50};
        // 使用原始的方式获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("===========");

        // for循环遍历
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
