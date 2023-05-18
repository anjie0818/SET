/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.junit5params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourceDemoTest {

    @ParameterizedTest // 1. 声明参数化测试类
    // 2. 使用CsvFileSource 注解声明参数化数据， 使用关键字 resources指定文件
    // 注意： 文件名前面需要加 /
    @CsvFileSource(resources = "/data/data.csv")
//    3. 给测试方法添加形参
    void csvFileSourceDemo1(String name, Integer age){
        System.out.println(name +"的年龄是："+age);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data2.csv", delimiterString = "|")
    void csvFileSourceDemo2(String name, Integer age){
        System.out.println(name +"的年龄是："+age);
    }
}
