package com.hogwarts.ch12_interface;

/**
 * 接口
 * 演示接口的默认方法
 */
public interface InDefaultMethod {
    // 默认方法
    public default void run(){
        System.out.println("接口默认方法run");
    }

    // 默认方法
    public default void walk(){
        System.out.println("接口默认方法walk");
    }
}
