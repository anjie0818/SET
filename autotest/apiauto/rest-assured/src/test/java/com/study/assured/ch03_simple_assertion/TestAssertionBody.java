package com.study.assured.ch03_simple_assertion;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestAssertionBody {

    @Test
    void testResponseBody(){
        given()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all()
                .body("origin",equalTo("172.17.56.110"))
        ;
    }
}
