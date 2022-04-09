package com.study.assured.ch03_simple_assertion;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestAssertionStatusCode {

    @Test
    void testStatusCode(){
        given()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .statusCode(200)
        .log().all();

    }
}
