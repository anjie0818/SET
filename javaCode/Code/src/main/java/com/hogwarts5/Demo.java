/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts5;

public class Demo {
    public static void main(String[] args) {
        // 正常写法
//        Hogwarts obj = new Sihan();
//        obj.run();
        Hogwarts obj = new Hogwarts() {
            @Override
            public void run() {
                System.out.println("xxx");
            }
        };
    }
}
