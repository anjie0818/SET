/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch13_auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestAuth {

    @Test
    void testAuth(){

        // 定义本地代理配置
        RestAssured.proxy = host("127.0.0.1").withPort(8888);
        // 忽略HTTPS校验
        RestAssured.useRelaxedHTTPSValidation();


        given()
                .auth().basic("hogwarts", "123")
                .log().headers()
                .log().body()
        .when()
                .get("https://httpbin.ceshiren.com/basic-auth/hogwarts/666")
        .then()
                .statusCode(200);
    }
}
