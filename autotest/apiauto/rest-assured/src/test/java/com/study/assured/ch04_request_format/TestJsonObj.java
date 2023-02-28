package com.study.assured.ch04_request_format;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TestJsonObj {

    @Test
    void testJsonObj(){
        HashMap<String,String> jsonObj = new HashMap<>();
        jsonObj.put("hello","rest-assured");

        given()
                .contentType("application/json")
                .body(jsonObj)
                .log().headers()
                .log().body()
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
                .statusCode(200)
        ;
    }
}
