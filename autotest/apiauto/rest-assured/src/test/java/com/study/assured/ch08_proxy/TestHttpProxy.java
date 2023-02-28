package com.study.assured.ch08_proxy;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestHttpProxy {

    @Test
    void testHttpProxy(){
// 定义一个代理的配置信息
        RestAssured.proxy = host("127.0.0.1").withPort(7890);

        given()
//                .proxy("localhost",8888)
                .when()
                .get("http://httpbin.org/get")
                .then()
                .log().all()
                .statusCode(200);

    }
}
