package com.study.assured.ch01_rest_assured;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestRestAssrued {

    @Test
    void fun(){
        given()
                .header("hello","rest-assured")
                .log().all()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all();
    }

}
