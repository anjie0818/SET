/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch09_headers_cookie;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestCookie {

    @Test
    void testCookie(){

        RestAssured.proxy = host("127.0.0.1").withPort(8888);
        RestAssured.useRelaxedHTTPSValidation();

        given()
                .cookies("my_cookie", "hogwarts_cookie", "my_cookie2", "cookie_value_2")
                .log().headers()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .statusCode(200);
    }

}
