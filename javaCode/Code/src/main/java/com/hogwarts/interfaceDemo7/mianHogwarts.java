/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.interfaceDemo7;

public class mianHogwarts {
    public static void main(String[] args) {
        Harry harry = new Harry();
        // 打印hogwarts除你武器
        // 因为子类会优先执行父类的成员方法。
        harry.Expelliarmus();
    }
}
