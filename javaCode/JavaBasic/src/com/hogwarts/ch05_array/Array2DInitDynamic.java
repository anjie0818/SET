/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch05_array;

/**
 * 二维数组：动态初始化
 */
public class Array2DInitDynamic {
    public static void main(String[] args) {
        // 声明二维数组
        int[][] array2DA;
        // 初始化
        array2DA = new int[4][3];
        array2DA[0][0] = 23;
        array2DA[0][1] = 89;
        array2DA[0][2] = 12;
        System.out.println(array2DA[0][0]);
        System.out.println(array2DA[0][1]);

        // 声明一个double类型二维数组
        double[][] array2DB = new double[2][2];

        // 打印二维数组的长度：高维的长度
        System.out.println(array2DA.length);

        // 访问元素
        System.out.println(array2DB[1][1]);
        System.out.println(array2DB[9][9]);
    }

}
