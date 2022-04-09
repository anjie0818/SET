package com.study.assured.ch02_simple_request;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestPost {

    @Test
    void testPost(){
        given()
                .header("hello","rest-assured")
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
                .log().all()
                .statusCode(200)
        ;
    }
}
