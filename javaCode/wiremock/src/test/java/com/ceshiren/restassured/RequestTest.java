/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

package com.ceshiren.restassured;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RequestTest {

    @Test
    void request(){
        given().log().all()
                .header("Accept","xml")
                .cookie("session","12345")
                .queryParam("search_term","WireMock")
                .auth().preemptive().basic("gaigai@ceshiren.com","hogwarts123")
                .body("{a:1,b:99,c:20}")
                .when()
                .post("http://localhost:8089/wiremock")
                .then().log().all();
    }
}
