package com.study.assured.ch02_simple_request;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestGet {

    @Test
    void testGet(){
        given()
                .param("hello","hogwarts")
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                //响应解析、断言
                .log().all()
                .statusCode(200);

    }
}
