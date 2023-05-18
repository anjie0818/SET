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
public class Test04_StepModelTest {
    public static final Logger logger = LoggerFactory.getLogger(Test04_StepModelTest.class);

    @BeforeAll
    static void loadApi(){
        ApiLoader.load("src/test/resources/api");
        logger.info("Done!");
    }
    @Test
    void runTest() throws IOException {
       //实参
        ArrayList<String> actualParameter =new ArrayList<>();
        actualParameter.add("ww5ef451bf006ec894");
        actualParameter.add("EcEIog2OJ8AtO7PDaqt_yuVZS3NeYF3kcko9Vd6i9EE");
        //断言
        ArrayList<AssertModel> asserts = new ArrayList<>();
        AssertModel assertModel = new AssertModel();
        assertModel.setActual("errcode");
        assertModel.setReason("getToken错误码校验01！");
        assertModel.setMatcher("equalTo");
        assertModel.setExpect("0");
        asserts.add(assertModel);

        //save
        HashMap<String,String> save = new HashMap<>();
        save.put("accesstoken","access_token");

        //globalsave
        HashMap<String,String> saveGlobal = new HashMap<>();
        saveGlobal.put("accesstoken","access_token");

        StepModel stepModel = new StepModel();
        stepModel.setApi("tokenhelper");
        stepModel.setAction("getToken");
        stepModel.setActualParameter(actualParameter);
        stepModel.setAsserts(asserts);
        stepModel.setSave(save);
        stepModel.setSaveGlobal(saveGlobal);
        stepModel.run(null);
        logger.info("debbuger!");
    }
}