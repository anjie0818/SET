/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.finalDemo;

public class Father  {
    // 使用 final 修饰次方法，不可以被覆盖重写
    public final void add(){
        System.out.println("加法");
    }
    public void sub(){
        System.out.println("减法");
    }
}
