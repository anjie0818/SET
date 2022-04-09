package com.study.assured.ch06_json_parse;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJsonPath {

    @Test
    void testJsonPath(){
        String resp = given()
                .header("Hello","anjie")
                .when()
                .get("https://httpbin.ceshiren.com/get")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response().asString();
        String word = JsonPath.read(resp, "$.headers.Hello");
        System.out.println(word);

        assertEquals("anjie",word);
    }


}
