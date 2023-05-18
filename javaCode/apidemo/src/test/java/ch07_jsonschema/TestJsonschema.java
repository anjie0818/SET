/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch07_jsonschema;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class TestJsonSchema {

    @Test
    void testJsonSchema(){
        given()
        .when()
                .get("https://httpbin.ceshiren.com/get")  // 发起GET请求
        .then()
                .log().all()  // 打印完整的响应信息
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schemademo.json"));  // JSON Schema断言
    }

}
