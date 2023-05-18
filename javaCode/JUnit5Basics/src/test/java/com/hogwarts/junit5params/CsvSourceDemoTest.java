/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.junit5params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceDemoTest {

    @ParameterizedTest // 1. 使用此注解声明是一个参数化的测试类
    // 2. 使用CsvSource注解传递参数化数据，传递的参数格式是一个集合，
    // 如果是多个参数，使用默认分隔符, 分开
    @CsvSource({"哈利,2", "赫敏,22", "罗恩,12"})
    void csvSourceDemo(String name, Integer age){
        System.out.println(name+"的年龄是:"+age);
    }

    @ParameterizedTest
    // 使用 delimiterString 指定分隔符， 使用value 指定数据源
    @CsvSource(value = {"哈利-2", "赫敏-3", "罗恩-5"}, delimiterString = "-")
    void csvSourceDemo2(String name, Integer age){
        System.out.println(name+"的年龄是:"+age);
    }


}
