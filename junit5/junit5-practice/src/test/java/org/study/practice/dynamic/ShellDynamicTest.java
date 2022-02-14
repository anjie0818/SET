package org.study.practice.dynamic;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.provider.Arguments;
import org.study.practice.entity.ShellResult;
import org.study.practice.entity.ShellTestResults;
import org.study.practice.entity.SumData;
import org.study.practice.entity.SumDatas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class ShellDynamicTest {

    /**
     * 参数化
     * 区别点：
     * 参数化的都是直接写好的，在编译前创建的测试
     * 动态测试是编译之后，边运行边生成测试用例
     * @return
     */
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream(){
        List<ShellResult> results = selectDataByYaml();
        List<DynamicTest> dynamicList = new ArrayList();
        results.forEach(result->{
            dynamicList.add(dynamicTest(result.getCaseName(),()-> assertTrue(result.getResult())));
        });
        return dynamicList.stream();
    }

    private List<ShellResult> selectDataByYaml(){
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        //为了正常的处理我们声明的日期
        objectMapper.findAndRegisterModules();
        TypeReference<ShellTestResults> typeReference =
                new TypeReference<>() {};
        ShellTestResults shellTestResults = null;
        try {
            shellTestResults  = objectMapper.readValue(new File("src/test/resources/shellTestResult.yaml"), typeReference);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return shellTestResults.getResultList();
    }

}
