/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

package ch02_simple_request;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestUrlParams {

    @Test
    void testParam(){
        given()
                .param("username", "Hogwarts")
                .param("id", 666)
                .log().all()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .statusCode(200);
    }

    @Test
    void testPostParam(){
        given()
                .queryParam("username", "HogwartsPost")
                .log().all()
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
                .statusCode(200);
    }

}
