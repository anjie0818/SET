/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch06_json_parse;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJsonPath {

    @Test
    void testJsonPath(){
        String resp = given()
                .header("Hello", "Hogwarts")
                .when()
                .get("https://httpbin.ceshiren.com/get")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response().asString();  // 提取响应文本

        // 解析响应数据
        String word = JsonPath.read(resp, "$.headers.Hello");
        System.out.println(word);

        // 断言
        assertEquals("Hogwarts", word);
    }



}
