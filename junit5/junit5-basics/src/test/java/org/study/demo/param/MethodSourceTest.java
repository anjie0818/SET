package org.study.demo.param;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileInputStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MethodSourceTest {

    /**
     *  单参数
     * @param argument
     */
    @ParameterizedTest
//    @MethodSource("stringProvider")
    @MethodSource //空时，找同名静态方法
    void testWithLocalMethod(String argument){
        System.out.println("-----"+argument+"-----");
    }
    static Stream<String> stringProvider(){
        return Stream.of("张三","李四","王五");
    }
    static Stream<String> testWithLocalMethod(){
        return Stream.of("张三","李四","王五");
    }

    /**
     * 多参数
     * @param str
     * @param num
     */
    @ParameterizedTest
    @MethodSource
    void testWithMultiArgs(String str,int num){
        System.out.println(str+"---"+num);
    }
    static Stream<Arguments> testWithMultiArgs(){
        return Stream.of(
                arguments("app",2),
                arguments("per",5)
        );
    }

}
