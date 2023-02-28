package com.study.assured.ch11_timeout;

import io.restassured.RestAssured;
import io.restassured.config.ConnectionConfig;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class TestTimeout {
    @BeforeAll
    static void setupClass(){
        RestAssured.baseURI = "https://httpbin.ceshiren.com";
        RestAssured.useRelaxedHTTPSValidation();
    }

    @Test
    void case1(){
        given()
                .when()
                .get("/get")
                .then()
                .log().all();
    }

    @Test
    void case2(){

        ConnectionConfig.CloseIdleConnectionConfig closeIdleConnectionConfig =
                new ConnectionConfig.CloseIdleConnectionConfig(3L, TimeUnit.SECONDS);
        ConnectionConfig connectionConfig = new ConnectionConfig(closeIdleConnectionConfig);
        RestAssuredConfig restAssuredConfig = new RestAssuredConfig().connectionConfig(connectionConfig);


        given()
                .config(restAssuredConfig)
                .when()
                .get("/delay/2")
                .then()
                .log().all();
    }
}
