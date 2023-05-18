/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.interfaceDemo2;

public class mainDemo {


    public static void main(String[] args) {
        eat(()->{
            System.out.println("使用lamb实现eat方法");
        });
    }

    // 直接main方法所在类定义一个静态的eat 方法，将Animal 接口作为形参
    public static void eat(Animal animal){
        // 调用的eat方法
        animal.eat();
    }

}
