package com.study.assured.ch08_proxy;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestHttpsProxy {

    @Test
    void testHttpProxy(){
        // 定义一个代理的配置信息
        RestAssured.proxy = host("127.0.0.1").withPort(7890);
        // 忽略HTTPS校验
        RestAssured.useRelaxedHTTPSValidation();

        given()
//                .proxy("localhost",8888)
                .when()
                .get("https://httpbin.org/get")
                .then()
                .log().all()
                .statusCode(200);

    }
}
