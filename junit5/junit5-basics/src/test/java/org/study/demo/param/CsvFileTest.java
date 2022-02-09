package org.study.demo.param;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvFileTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void testParamCsv1(String name,Integer age){
        System.out.println(name + "---" + age);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data1.csv",delimiterString = "|")
    void testParamCsv2(String name,Integer age){
        System.out.println(name + "---" + age);
    }
}
