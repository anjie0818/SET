/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts4;

public class Demo2Hogwarts {
    public static void main(String[] args) {
        // 同个package可以访问除priva之外的所有
        System.out.println(new DemoHogwarts().num1);
        System.out.println(new DemoHogwarts().num2);
        System.out.println(new DemoHogwarts().num3);
    }
}
