/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.interfaceDemo4;

public class mainDemo {
    public static void main(String[] args) {
        // 调用getWeightDemo方法，正常写法
        getWeightDemo(10,
                (int weight)->{return weight;}
        );
        // 可以省略`()`参数的类型
        getWeightDemo(10, (weight)->{return weight;});
        // 如果有且仅有一个参数，则`()`可以省略
        getWeightDemo(10, weight->{return weight;});
//        如果`{}`内有且仅有一个语句，无论是否有返回值，
//        都可以省略`{}`，`return`关键字以及`;`
         getWeightDemo(10, weight->weight);
    }


    public static void getWeightDemo(int weight, Animal animal){
        animal.getWeight(weight);
        System.out.println("这个动物的体重是"+weight);
    }
}
