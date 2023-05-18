package ch01_rest_assured;/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;

public class TestRestAssured {
    @Test
    void fun(){
        given()
                .header("Hello","hogwarts")
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all();
    }
}
