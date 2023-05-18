/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch08_proxy;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestHttpProxy {
    @Test
    void testHttpProxy(){

        // 定义一个代理的配置信息
        RestAssured.proxy = host("127.0.0.1").withPort(8888);

        given()
//                .proxy("localhost",8888)
        .when()
                .get("http://httpbin.org/get")
        .then()
                .log().all()
                .statusCode(200);
    }
}
