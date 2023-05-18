package com.hogwarts.ch12_interface;

/**
 * 接口
 * 演示继承与接口的优先级
 */
public interface PriSchool {
    public default void study(){
        System.out.println("上课");
    }
}
