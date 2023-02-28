package com.study.assured.ch06_json_parse;

import org.junit.jupiter.api.Test;
import static io.restassured.path.json.JsonPath.from;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJsonResp {
    @Test
    void testJsonResp(){

        String resp = given()
                .header("Hello", "Hogwarts")
                .when()
                .get("https://httpbin.ceshiren.com/get")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response().asString();  // 提取响应文本

        // 解析响应数据
        String word = from(resp).getString("headers.Hello");
        System.out.println(word);

        // 断言
        assertEquals("Hogwarts", word);
    }
}
