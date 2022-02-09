package org.study.practice.base;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.study.practice.Calculator;

import java.lang.reflect.Method;
import java.util.Optional;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

public class CalBase {
    static final Logger logger = getLogger(lookup().lookupClass());
    public static Calculator calculator ;
    public int result;
    public String resultStr;
    @BeforeAll
    static void createCal(){
        calculator = new Calculator("计算器");
    }
    @AfterAll
    static void closeCal(){
        calculator.close();
    }

    @BeforeEach
    void createId(){
        calculator.initId();
        logger.info("开始进行计算");
    }

    @AfterEach
    void destoryId(TestInfo testInfo){
        String strs = testInfo.getTestMethod().map(Method::getName)
                .filter(str -> str.contains("Str")).ofNullable(resultStr)
                .orElse(String.valueOf(result));

        logger.info("计算结果：{}",strs);
        calculator.destroyId();

    }
}
