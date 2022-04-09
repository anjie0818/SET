package com.study.assured.ch15_envs;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class a_TestEnvs {
    @Test
    void testOrg(){
        given()
                .when()
                .get("http://httpbin.org/get")
                .then()
                .statusCode(200);
    }

    @Test
    void testCeshiren(){
        RestAssured.useRelaxedHTTPSValidation();

        given()
                .when()
                .get("https://httpbin.ceshiren.com/get")
                .then()
                .statusCode(200);
    }
}

