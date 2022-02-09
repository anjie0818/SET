package org.study.practice.nums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.study.practice.base.CalBase;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubTest extends CalBase {

    @ParameterizedTest(name = "{0} 减 {1} 等于 {2}")
    @MethodSource
    @Tag("true")
    @DisplayName("俩数相减")
    void subTest1(int a,int b,int expect){
       result = calculator.subtract(a,b);
       assertEquals(expect,result,"俩数相减值错误");
    }
    static Stream<Arguments> subTest1(){
        return Stream.of(
                arguments(10,9,1),
                arguments(99,99,0),
                arguments(99,-99,198),
                arguments(-99,99,-198),
                arguments(-99,-99,0)
                );
    }
    @ParameterizedTest(name = "{0} 减 {1} 等于 默认 0")
    @MethodSource
    @Tag("true")
    @DisplayName("俩数相减超过边界")
    void subTest2(int a,int b){
        result = calculator.subtract(a,b);
        assertEquals(0,result,"俩数相减值错误");
    }
    static Stream<Arguments> subTest2(){
        return Stream.of(
                arguments(110,9),
                arguments(-199,99)
        );
    }
    @ParameterizedTest(name = "100 减 {0} 减 {1} 减{2} 等于 {3}}")
    @MethodSource
    @Tag("true")
    @DisplayName("三数相减")
    void subTest3(int a,int b,int c,int expect){
        result = calculator.subtract(a,b,c);
        assertEquals(expect,result,"俩数相减值错误");
    }
    static Stream<Arguments> subTest3(){
        return Stream.of(
                arguments(10,9,1,80),
                arguments(99,-99,0,100)
        );
    }
}
