/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch05_array;

/**
 * 数组反转
 */
public class ArrayReverse {
    public static void main(String[] args) {
        // 原来的数组
        int[] oldArr = {10, 20, 30, 40, 50};
        // 新数组
        int[] newArr = new int[oldArr.length];
        // 遍历
        for(int i=0; i< newArr.length; i++){
            // 新数组：0-1-2-3-4
            // 原数组：4-3-2-1-0
            newArr[i] = oldArr[oldArr.length-1 - i];
            // 打印新数组的元素
            System.out.println(newArr[i]);
        }
    }
}
