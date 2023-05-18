package ch03_simple_assertion;/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestAssertionBody {
    @Test
    void testResponseBody(){
        given()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all()
                .body("origin", equalTo("14.26.73.200"));
    }
}
