/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.junit5params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MulitiMethodSourceDemoTest {

    @ParameterizedTest
//    @MethodSource("objectProvider")
    @MethodSource
    // 1. 形参变多了
    void mulitiMethodSourceDemo(String name, Integer age){
        System.out.println(name+"的年龄是："+age);
    }

    static Stream<Arguments> objectProvider(){
        return Stream.of(

                Arguments.arguments("哈利", 5),
                Arguments.arguments("赫敏", 6)
        );
    }
    // 2.返回的不再是 Stream<基本的数据类型> 而是Stream(arguments(数据信息))
    static Stream<Arguments> mulitiMethodSourceDemo(){
        return Stream.of(

                Arguments.arguments("哈利", 7),
                Arguments.arguments("赫敏", 8)
        );
    }}
