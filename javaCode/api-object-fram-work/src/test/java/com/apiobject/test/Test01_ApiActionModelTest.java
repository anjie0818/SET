/**
 * projectName: apiobject-framwork
 * fileName: Test01_ApiActionModelTest.java
 * packageName: com.apiobject.test
 * date: 2021-06-19 下午2:56
 */
package com.apiobject.test;

import com.apiobject.framework.actions.ApiActionModel;
import com.apiobject.framework.global.GlobalVariables;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: Test01_ApiActionModelTest
 * @packageName: com.apiobject.test
 * @description: ApiActionModel单元测试
 * @data: 2021-06-19 下午2:56
 **/
public class Test01_ApiActionModelTest {
    @Test
    void runTest(){
        ArrayList<String> actualParameter =new ArrayList<>();
        actualParameter.add("ww5ef451bf006ec894");
        actualParameter.add("EcEIog2OJ8AtO7PDaqt_yuVZS3NeYF3kcko9Vd6i9EE");

        ApiActionModel apiActionModel = new ApiActionModel();
        apiActionModel.setUrl("https://qyapi.weixin.qq.com/cgi-bin/${x}");

        HashMap<String,String> globalVariables =new HashMap<>();
        globalVariables.put("x","gettoken");
        GlobalVariables.setGlobalVariables(globalVariables);

        ArrayList<String> formalParameter = new ArrayList<>();
        formalParameter.add("corpid");
        formalParameter.add("corpsecret");
        apiActionModel.setFormalParam(formalParameter);

        HashMap<String,String> query = new HashMap<>();
        query.put("corpid","${corpid}");
        query.put("corpsecret","${corpsecret}");
        apiActionModel.setQuery(query);

        Response response =  apiActionModel.run(actualParameter);

    }
}