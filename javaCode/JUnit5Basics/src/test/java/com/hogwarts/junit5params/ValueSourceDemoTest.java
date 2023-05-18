/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.junit5params;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueSourceDemoTest {

    //@Test 尽量不要将@Test 和 ParameterizedTest结合使用，如果使用，则用例多执行一次
    // 1. 将Test注解换为ParameterizedTest注解
    // 声明测试类是一个参数化的测试类
    @ParameterizedTest
    // 2. 传递测试数据
    // 使用单参数注解@ValueSource传递参数化的数据内容
    // 传递参数的过程中，需要通过 ValueSource定义的关键字进行类型声明
    @ValueSource(strings = {"张三", "李四", "王五"})
//    @ValueSource(ints = {1, 2, 3})
    // 3. 在测试方法上面添加形参，接受参数化的数据
    void valueSourceDemo(String name){
//    void valueSourceDemo(Integer name){
        // 断言数据的长度是否等于2
        assertEquals(name.length(), 2);
    }
}
