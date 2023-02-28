package com.study.assured.ch09_headers_cookies;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestCookie {

    @Test
    void testCookie(){

        given()
                .cookies("my_cookie", "hogwarts_cookie", "my_cookie2", "cookie_value_2")
                .log().all()
                .when()
                .get("https://httpbin.ceshiren.com/get")
                .then()
                .statusCode(200);
    }

}
