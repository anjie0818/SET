/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

package com.ceshiren.restassured;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class WeatherTest {

    @Test
    void weatherTest(){
        given().log().all()
                .queryParam("key","9efd073d2026890392a3aa8ff1b018d3")
                .queryParam("city","110100")
                .when()
                .get("https://restapi.amap.com/v3/weather/weatherInfo")
                .then().log().all();
    }



    @Test
    void weatherPoxyTest(){
        given().log().all()
                .queryParam("key","9efd073d2026890392a3aa8ff1b018d3")
                .queryParam("city","120000")
                .when()
                .get("http://localhost:8089/v3/weather/weatherInfo")
                .then().log().all();
    }
}
