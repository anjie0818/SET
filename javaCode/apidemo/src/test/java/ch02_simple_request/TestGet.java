package ch02_simple_request;/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestGet {
    @Test
    void testGet(){
        given()
                // 可以设置测试预设
                .param("hello", "hogwarts")
        .when()
                // 发起 GET 请求
                .get("https://httpbin.ceshiren.com/get")
        .then()
                // 响应解析、断言
                .log().all()
                .statusCode(200);
    }
}
