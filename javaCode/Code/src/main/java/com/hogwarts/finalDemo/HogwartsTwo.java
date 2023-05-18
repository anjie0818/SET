/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.finalDemo;

public class HogwartsTwo {
    // 使用 final 修饰的成员变量没有默认值
    // 解决这个问题有两种方式，两种方式必须选一种

    // 1. 直接赋值
    //  private final String name="Harry";

    // 2. 通过构造方法赋值，并且有参、无参两个构造方法都必须要进行赋值
    private final String name;
    public HogwartsTwo() {
        name = "Harry";
    }
    public HogwartsTwo(String name) {
        this.name = name;
    }
    // 3. 错误写法！因为final 的变量是不可被修改的
//    public void setName(String name) {
//        this.name = name;
//    }
}
