/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch11_timeout;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;

import static io.restassured.RestAssured.given;

public class TestTimeout {

    @BeforeAll
    static void setupClass(){
        RestAssured.baseURI = "https://httpbin.ceshiren.com";
    }

    @Test
    void case1(){
        given()
        .when()
                .get("/get")
        .then()
                .statusCode(200);
    }

    @Test
    void case2(){

        // 自定义一个HttpClientConfig对象
        HttpClientConfig clientConfig = HttpClientConfig
                .httpClientConfig()
                .setParam("http.socket.timeout", 3000);

        // 自定义一个RestAssuredConfig对象
        RestAssuredConfig myConfig = RestAssuredConfig.config().httpClient(clientConfig);

        given()
                .config(myConfig)
        .when()
                .get("/delay/10")
        .then()
                .statusCode(200);
    }

    @Test
    void case3(){
        given()
        .when()
                .get("/get")
        .then()
                .statusCode(200);
    }
}
