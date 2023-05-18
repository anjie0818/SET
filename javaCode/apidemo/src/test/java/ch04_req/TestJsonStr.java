/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch04_req;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestJsonStr {
    @Test
    void testJsonStr(){

        // 定义请求数据：jsonstr
        String jsonStr = "{\"hello\": \"hogwarts\"}";

        given()
                .contentType("application/json")
                .body(jsonStr)
                .log().headers()
                .log().body()
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
//                .log().all()
                .statusCode(200);

    }

}
