package ch02_simple_request;/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestPost {
    @Test
    void testPost(){
        given()
                // 可以设置测试预设
                .header("hello", "hogwarts")
        .when()
                // 发起POST请求
                .post("https://httpbin.ceshiren.com/post")
        .then()
                // 解析结果、断言
                .log().all()
                .statusCode(200);
    }
}
