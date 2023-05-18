/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts4;

public class DemoHogwarts {
    // 在同一个类中，无论如何都能访问
    public int num1 = 10;
    protected int num2 = 11;
    //default
    int num3 = 12;
    private int num4 = 13;
    public void demo(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

}
