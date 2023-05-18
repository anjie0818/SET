/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch12_interface;

/**
 * 接口
 * 演示接口的私有方法
 */
public interface InPrivateMethod {
    // 私有普通方法
    private void privateMethod(){};

    // 私有静态方法
    private static void privateStaticMethod(){};

    // 默认方法
    public default void defaultMethod(){
        privateMethod();
        privateStaticMethod();
    }

    // 静态方法
    public static void staticMethod(){
        privateStaticMethod();
        // 无法访问私有普通方法
    }
}
