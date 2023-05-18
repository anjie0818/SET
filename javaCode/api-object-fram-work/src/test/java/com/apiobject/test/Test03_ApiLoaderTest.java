/**
 * projectName: apiobject-framwork
 * fileName: Test02_ApiObjectModelTest.java
 * packageName: com.apiobject.test
 * date: 2021-06-19 下午3:37
 */
package com.apiobject.test;

import com.apiobject.framework.api.ApiObjectModel;
import com.apiobject.framework.global.ApiLoader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: Test02_ApiObjectModelTest
 * @packageName: com.apiobject.test
 * @description:
 * @data: 2021-06-19 下午3:37
 **/
public class Test03_ApiLoaderTest {
    public static final Logger logger = LoggerFactory.getLogger(Test03_ApiLoaderTest.class);

    @BeforeAll
    static void loadApi(){
        ApiLoader.load("src/test/resources/api");
        logger.info("Done!");
    }
    @Test
    void loadTest() throws IOException {
        ArrayList<String> actualParameter =new ArrayList<>();
        actualParameter.add("ww5ef451bf006ec894");
        actualParameter.add("EcEIog2OJ8AtO7PDaqt_yuVZS3NeYF3kcko9Vd6i9EE");

        ApiLoader.getAction("tokenhelper","getToken").run(actualParameter);
    }
}