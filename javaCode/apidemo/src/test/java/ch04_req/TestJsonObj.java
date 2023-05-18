/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch04_req;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TestJsonObj {
    @Test
    void testJsonObj(){
        // 定义请求体数据 HashMap对象
        HashMap<String, String> jsonObj = new HashMap<String, String>();
        jsonObj.put("hello", "hogwarts");

        given()
                .contentType("application/json")
                .body(jsonObj)
                .log().headers()
                .log().body()
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
                .statusCode(200);
    }
}
