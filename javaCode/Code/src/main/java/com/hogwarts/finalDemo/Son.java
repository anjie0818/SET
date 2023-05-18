/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.finalDemo;

public class Son extends Father {
    // 错误写法，因为重写的方法使用final修饰
//    @Override
//    public void add(){
//    }
    // 没有使用final修饰的可以重写
    @Override
    public void sub(){}
}

