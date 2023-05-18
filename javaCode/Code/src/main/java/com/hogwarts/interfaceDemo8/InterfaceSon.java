package com.hogwarts.interfaceDemo8;

// 一个接口能继承另一个或者多个接口
//接口的继承使用extends关键字
public interface InterfaceSon extends InterfaceOne, InterfaceTwo{
    //如果父接口中默认方法有重名，那么子接口需要重写。
    @Override
    default void methodCommon() {
        System.out.println("重写重名方法");
    }
}
