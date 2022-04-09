package com.study.assured.ch09_headers_cookies;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestHeaders {

    @Test
    void testHeader(){
        given()
                .headers("My-Header1", "value1", "My-Header2", "value2")
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all()
                .statusCode(200);

    }
}
