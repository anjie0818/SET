package com.hogwarts.ch12_interface;

/**
 * 父接口
 * 演示接口多实现规则之默认方法
 */
public interface MultiRuleDefaultTwo {
    public default void two(){};
    public default void sameName(){};  // 重名的默认方法
}