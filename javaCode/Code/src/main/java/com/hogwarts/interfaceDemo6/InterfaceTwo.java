/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.interfaceDemo6;

// 接口InterfaceTwo 有两个方法
public interface InterfaceTwo {
    public default void methodTwo(){};
    // 两个接口都有此方法
    public default void methodCommon(){};
}