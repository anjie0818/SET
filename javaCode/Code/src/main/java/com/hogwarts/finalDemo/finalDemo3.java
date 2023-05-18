/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 * final 作用于局部变量
 */
package com.hogwarts.finalDemo;

public class finalDemo3 {
    public static void main(String[] args) {
        // 基本类型示例
        // 未使用 final 修饰符时，赋值后还可以再次修改
        int numOne = 10;
        System.out.println(numOne); // 10
        numOne = 20;
        System.out.println(numOne); // 20
        // 使用 final 来修饰局部变量后，那么这个变量就不能改变
        final int numTwo = 300;
        //  numTwo = 400; 错误写法
        // 另一种写法，定义后在赋值（注意，不是修改）
        final int numThree;
        numThree = 30;
    }
}
