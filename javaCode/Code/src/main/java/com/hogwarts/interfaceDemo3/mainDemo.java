/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.interfaceDemo3;

public class mainDemo {
    public static void main(String[] args) {
        // 调用getWeightDemo方法，
        getWeightDemo(10,
                (int weight)->{return weight;}
        );
    }
    // 直接main方法所在类定义一个静态的getWeightDemo方法
    // 形参为 weight 和 Animal接口
    public static void getWeightDemo(int weight,Animal animal){
        // 调用getWeight方法
        animal.getWeight(weight);
        System.out.println("这个动物的体重是"+weight);
    }
}
