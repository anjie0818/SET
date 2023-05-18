package com.hogwarts.ch12_interface;

/**
 * 子接口
 * 演示接口的多实现
 */
public interface MultiExtendImpl extends MultiExtendOne, MultiExtendTwo{
    @Override
    default void sameName() {
//        MultiExtendOne.super.sameName(); // 调用父接口的被重写的逻辑
        System.out.println("重写多个父接口的重名默认方法");
    }
}
