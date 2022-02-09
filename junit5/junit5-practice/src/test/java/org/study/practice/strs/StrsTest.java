package org.study.practice.strs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.study.practice.base.CalBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StrsTest extends CalBase {

    @ParameterizedTest
    @MethodSource
    @DisplayName("三个字符串拼接")
    void testStrCon(String a, String b, String c){
        resultStr = calculator.concatStr(a,b,c);
        assertEquals(a + " " + b + " " + c,resultStr,"字符串拼接错误");
    }
    static Stream<Arguments> testStrCon(){
       return Stream.of(
               arguments("我","叫","安杰"),
               arguments("你","好","啊")
       );
    }
}

