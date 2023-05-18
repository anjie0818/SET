/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.interfaceDemo;

public class mainDemo {
    public static void main(String[] args) {
        HogwartsDemo hogwartsDemo = new HogwartsDemo();

        // 使用内部匿名类
        Hogwarts hogwarts = new Hogwarts() {
            @Override
            public void sortingCeremony() {
                System.out.println("");
            }
        };
        // 传入hogwarts对象
        hogwartsDemo.startHogwarts(hogwarts);


        //使用内部匿名对象
        hogwartsDemo.startHogwarts(new Hogwarts() {
            @Override
            public void sortingCeremony() {
                System.out.println("哈利分配到了格兰芬多");
            }
        });
        // 使用Lambda表达式
        hogwartsDemo.startHogwarts(()->{
            System.out.println("赫敏分配到了格兰芬多");
        });
    }
}
