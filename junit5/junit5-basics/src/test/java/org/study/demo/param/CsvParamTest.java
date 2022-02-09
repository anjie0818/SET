package org.study.demo.param;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CsvParamTest {

    @ParameterizedTest
    @CsvSource({"张三,3","李四,4","王五,5"})
    void testParamCsv1(String name,Integer age){
        System.out.println(name + "---" + age);
    }
    @ParameterizedTest
    @CsvSource(value = {"张三|3","李四|4","王五|5"},delimiterString = "|")
    void testParamCsv2(String name,Integer age){
        System.out.println(name + "---" + age);
    }
}
