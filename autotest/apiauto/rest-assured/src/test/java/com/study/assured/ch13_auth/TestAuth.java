package com.study.assured.ch13_auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestAuth {

    @Test
    void testAuth(){
        RestAssured.useRelaxedHTTPSValidation();

        given()
                .auth().basic("hogwarts", "666")
                .log().headers()
                .log().body()
                .when()
                .get("https://httpbin.ceshiren.com/basic-auth/hogwarts/666")
                .then()
                .statusCode(200);

    }
}
