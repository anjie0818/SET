/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package com.hogwarts.ch12_interface;

/**
 * 实现类
 * 演示接口多实现规则之默认方法
 */
public class MultiRuleDefaultImpl implements MultiRuleDefaultOne, MultiRuleDefaultTwo{
    @Override
    public void sameName(){
        // 重写
        System.out.println("如果多接口的默认方法重名，则必须重写");
    }
}
