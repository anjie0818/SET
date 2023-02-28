package com.study.assured.ch07_json_schema;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestJsonSchema {
    /**
     * JSON Schema 在线生成工具：https://app.quicktype.io
     */
    @Test
    void testJsonSchema(){
        given()
                .param("hogwarts","hogwarts")
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"))
        ;
    }
}
