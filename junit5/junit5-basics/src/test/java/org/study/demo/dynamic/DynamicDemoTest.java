package org.study.demo.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.slf4j.LoggerFactory.getLogger;

public class DynamicDemoTest {

    static final Logger logger = getLogger(lookup().lookupClass());

    //测试工厂：生产测试方法
    //动态测试用例：返回的必须是DynamicTest的 Collection，stream，Iterable，Iterator
    //不能是private
    //不能是static
    //动态方法中没有beforeEach afterEach

    /**
     * TestFactory去告诉JUnit5框架 ：这是一个创建动态测试的工厂
     */
    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection(){
        return Arrays.asList(
                dynamicTest("first testcase",()->{
                    assertTrue(true);
                    logger.info("动态测试第一个用例");
                }),
                dynamicTest("second testcase",()->{
                    assertTrue(true);
                    logger.info("动态测试第二个用例");
                })
                );
    }
    /**
     * TestFactory去告诉JUnit5框架 ：这是一个创建动态测试的工厂
     */
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream(){
        return Arrays.asList(
                dynamicTest("first testcase",()->{
                    assertTrue(true);
                    logger.info("动态测试第一个用例");
                }),
                dynamicTest("second testcase",()->{
                    assertTrue(true);
                    logger.info("动态测试第二个用例");
                })
        ).stream();
    }

}
