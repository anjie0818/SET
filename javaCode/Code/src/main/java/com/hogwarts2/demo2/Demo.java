/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts2.demo2;

public class Demo {
    // 方法： 是否具有此方法看左边的声明，具体执行哪个方法看右边 new 的对象是谁。
    // 变量： 跟着左边new 的对象走。
    public static void main(String[] args) {
        Father obj = new Son();
        obj.fatherEat();  // 子类没有，父类有，向上找父类
        obj.run();       // 父子都有，优先用子。
//        obj.sonEat(); // 错误写法，编译不能通过。

    }
}
