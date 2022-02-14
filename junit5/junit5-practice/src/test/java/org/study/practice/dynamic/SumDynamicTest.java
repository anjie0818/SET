package org.study.practice.dynamic;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.study.practice.Calculator;
import org.study.practice.entity.SumData;
import org.study.practice.entity.SumDatas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.study.practice.base.CalBase.calculator;

public class SumDynamicTest {
    
    @TestFactory
    List<DynamicTest> sumTestByYaml(){
        List<SumData> sumDatas = selectSumDatas();
        List<SumData> errorDatas = sumDatas.stream().filter(sumData -> sumData.getMessage().startsWith("无效")).collect(Collectors.toList());
        List<SumData> successDatas = sumDatas.stream().filter(sumData -> !sumData.getMessage().startsWith("无效")).collect(Collectors.toList());

        List<DynamicTest> dynamicList = new ArrayList<>();
        Calculator calculator = new Calculator("计算器测试");
        successDatas.forEach(sumData -> {
            DynamicTest dynamic = dynamicTest(sumData.getMessage(), () -> {
                int result = calculator.sum(sumData.getA(), sumData.getB());
                assertEquals(sumData.getResult(),result,sumData.getMessage());
            });
            dynamicList.add(dynamic);
        });
        errorDatas.forEach(sumData -> {
            DynamicTest dynamic = dynamicTest(sumData.getMessage(), () -> {
                IllegalArgumentException expection = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(sumData.getA(), sumData.getB()));
                assertTrue(expection.getMessage().contains("请输入范围内的整数"));
            });
            dynamicList.add(dynamic);
        });

        return dynamicList;
    }

    private List<SumData>  selectSumDatas() {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        //为了正常的处理我们声明的日期
        objectMapper.findAndRegisterModules();
        TypeReference<SumDatas> typeReference =
                new TypeReference<>() {};
        SumDatas sumDatas = null;
        try {
            sumDatas  = objectMapper.readValue(new File("src/test/resources/sumdatas.yaml"), typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        return sumDatas.getDatas();
    }

}
