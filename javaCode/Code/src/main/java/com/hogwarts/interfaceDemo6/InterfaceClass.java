/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.interfaceDemo6;

public class InterfaceClass implements InterfaceOne, InterfaceTwo{
    // 如果实现的接口中有重名的方法，则必须重写这个重名的方法
    @Override
    public void methodCommon() {
    }
}
