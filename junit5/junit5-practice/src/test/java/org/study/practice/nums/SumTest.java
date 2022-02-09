package org.study.practice.nums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.study.practice.base.CalBase;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumTest extends CalBase {

    @DisplayName("俩个数字相加")
    @Tag("true")
    //注意：参数化的时候Test注解去掉，换成ParameterizedTest
    //自定义参数化显示名 name   "[{index}] {argumentsWithNames}"
    //[{index}]  [1]  [2]   [3]
    //argumentsWithNames 相当于一个数组 直接拿取下标即可，下标从0开始
    @ParameterizedTest(name = "{0} 加 {1} 等于 {2}")
    @MethodSource
    void testSum1(int a,int b,int expectSum){
        result = calculator.sum(a, b);
        assertEquals(expectSum,result,"2个数字相加结果不相等");
    }
    static Stream<Arguments> testSum1(){
        return Stream.of(
                arguments(1,1,2),
                arguments(-99,99,0),
                arguments(99,-99,0),
                arguments(-99,-99,-198),
                arguments(99,99,198)
                );
    }
    @Test
    @DisplayName("三个数字相加")
    @Tag("true")
    void testSum2(){
        result = calculator.sum(1,2,3);
        assertEquals(6,result,"3个数字相加结果不相等");
    }
    @ParameterizedTest
    @MethodSource("testSum3")
    @DisplayName("无效边界")
    @Tag("false")
    void testSum3(int a,int b){
        IllegalArgumentException expection = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(a, b));
        assertTrue(expection.getMessage().contains("请输入范围内的整数"));
    }
    static Stream<Arguments> testSum3(){
        return Stream.of(
                arguments(100,0),
                arguments(-100,-1),
                arguments(2,100),
                arguments(1,-100)
                );
    }
}
