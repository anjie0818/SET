package com.example.wiremock;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RequestTest {

    @Test
    public void test1(){
        given().log().all()
                .header("Accept","xml")
                .cookie("session","12345")
                .queryParam("search_term","WireMock")
                .auth().preemptive().basic("anjiework@gmail.com","password")
                .body("{a:1,b:99,c:20}")
                .when()
                .get("http://localhost:8089/wiremock")
                .then().log().all()
        ;

    }
}
