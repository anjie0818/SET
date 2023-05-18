/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 *
 * 1. 使用 final 修饰 方法，这个方法就是最终方法，不能被覆盖重写
 *  修饰符 final 返回值类型 方法名称（参数列表）{
 *      方法体
 *  }
 * 对于类、方法来说，abstract 关键字和final关键字不能同时使用，因为矛盾
 * abstract 一定要被覆盖重写， final 反之
 */
package com.hogwarts.finalDemo;

public class finalDemo2 {
    public static void main(String[] args) {
    }

// 定义：修饰符 final 返回值类型 方法名称（参数列表）
    public final Integer add(){
        return 1+1;
    };
}
