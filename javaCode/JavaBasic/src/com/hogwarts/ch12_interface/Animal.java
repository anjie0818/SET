package com.hogwarts.ch12_interface;

/**
 * 父类：动物类
 */
public interface Animal {
    // 默认方法
    public default void run(){};

    // 静态方法
    public static void jump(){};

    // 私有方法
    private void walk(){};
}
