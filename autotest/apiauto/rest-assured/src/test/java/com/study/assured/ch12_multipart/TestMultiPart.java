package com.study.assured.ch12_multipart;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestMultiPart {

    @Test
    void testMultiPart(){

        File myFile = new File("src/test/resources/data.txt");

        // 定义本地代理配置
//        RestAssured.proxy = host("127.0.0.1").withPort(8888);
        RestAssured.proxy = host("localhost").withPort(8888);
        // 忽略HTTPS校验
        RestAssured.useRelaxedHTTPSValidation();

        given()
                .multiPart("hogwarts", myFile)
                .multiPart("ceshiren", "{\"hogwarts\": 666}", "application/json")
                .log().headers()
                .log().body()
                .when()
                .post("https://httpbin.ceshiren.com/post")
                .then()
                .statusCode(200);
    }

}
