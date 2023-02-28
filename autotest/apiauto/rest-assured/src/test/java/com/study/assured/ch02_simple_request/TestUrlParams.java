package com.study.assured.ch02_simple_request;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestUrlParams {

    @Test
    void testParam(){

        given()
                .param("username","testassured")
                .param("id",666)
                .log().all()
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
                .statusCode(200);
    }

}
