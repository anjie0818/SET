/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch15_envs;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestEnvs {
    @Test
    void testOrg(){
        given()
        .when()
                .get("http://httpbin.org/get")
        .then()
                .statusCode(200);
    }

    @Test
    void testCeshiren(){
        given()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .statusCode(200);
    }
}
