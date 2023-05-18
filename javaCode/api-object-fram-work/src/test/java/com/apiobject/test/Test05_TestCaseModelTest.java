/**
 * projectName: apiobject-framwork
 * fileName: Test02_ApiObjectModelTest.java
 * packageName: com.apiobject.test
 * date: 2021-06-19 下午3:37
 */
package com.apiobject.test;

import com.apiobject.framework.global.ApiLoader;
import com.apiobject.framework.steps.AssertModel;
import com.apiobject.framework.steps.StepModel;
import com.apiobject.framework.testcase.ApiTestCaseModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: Test02_ApiObjectModelTest
 * @packageName: com.apiobject.test
 * @description:
 * @data: 2021-06-19 下午3:37
 **/
public class Test05_TestCaseModelTest {
    public static final Logger logger = LoggerFactory.getLogger(Test05_TestCaseModelTest.class);

    @BeforeAll
    static void loadApi(){
        ApiLoader.load("src/test/resources/api");
        logger.info("Done!");
    }
    @Test
    void runTest() throws IOException {
        ApiTestCaseModel apiTestCaseModel = ApiTestCaseModel.load("src/test/resources/testcase/creatdepartment.yaml");
        apiTestCaseModel.run();
        logger.info("debbuger!");
    }
}