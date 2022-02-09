package org.study.demo.param;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"张三","李四","王五"})
    void testParam(String name){
        System.out.println("----"+name+"----");
    }
}
