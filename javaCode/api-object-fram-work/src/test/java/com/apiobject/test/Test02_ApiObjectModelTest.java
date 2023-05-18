/**
 * projectName: apiobject-framwork
 * fileName: Test02_ApiObjectModelTest.java
 * packageName: com.apiobject.test
 * date: 2021-06-19 下午3:37
 */
package com.apiobject.test;

import com.apiobject.framework.api.ApiObjectModel;
import org.junit.jupiter.api.Test;

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
public class Test02_ApiObjectModelTest {
    @Test
    void loadTest() throws IOException {
        ArrayList<String> actualParameter =new ArrayList<>();
        actualParameter.add("ww5ef451bf006ec894");
        actualParameter.add("EcEIog2OJ8AtO7PDaqt_yuVZS3NeYF3kcko9Vd6i9EE");

        ApiObjectModel apiObjectModel=ApiObjectModel.load("src/test/resources/api/tokenhelper.yaml");
        apiObjectModel.getActions().get("getToken").run(actualParameter);
    }
}