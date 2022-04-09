package com.study.assured.ch10_form;

import io.restassured.RestAssured;
import io.restassured.specification.ProxySpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestForm {

    @Test
    void testForm(){
        RestAssured.proxy = ProxySpecification.host("127.0.0.1").withPort(8888);

        RestAssured.useRelaxedHTTPSValidation();

        given()
                .formParams("username","anjie",
                        "passwd","6666")
                .log().all()
                .when()
                .post("https://httpbin.ceshiren.com/post")
                .then()
                .statusCode(200);
    }
}
