package com.study.assured.ch04_request_format;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestJsonStr {

    @Test
    void testJsonStr() {
        String jsonStr = "{\"hello\":\"anjie\"}";
        given()
                .contentType("application/json")
                .body(jsonStr)
                .log().headers()
                .log().body()
                .when()
                .post("https://httpbin.ceshiren.com/post")
                .then()
                .log().all()
                .statusCode(200)
        ;
    }
}
