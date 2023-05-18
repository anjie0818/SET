/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch05_array;

/**
 * 二维数组：静态初始化
 */
public class Array2DInitStatic {
    public static void main(String[] args) {
        // 传统方式
        int[][] array2DA = new int[][]{{1,2}, {3, 4}, {5, 6}};

        // 简写方式
        int[][] array2DB = {{1, 2},{3, 4},{5, 6}};

        // 访问元素：数组的名称[高维下标][低维下标]
//        System.out.println(array2DB[0][1]);

        // 遍历我们的二维数组 for
        for(int i = 0; i<array2DB.length; i++){
            for(int j=0; j<array2DB[i].length; j++){
                System.out.print(array2DB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
