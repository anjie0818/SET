/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch10_form;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestForm {

    @Test
    void testForm(){
        // 配置本地代理，方便抓包查看接口请求
        RestAssured.proxy = host("127.0.0.1").withPort(8888);
        // 忽略HTTPS校验
        RestAssured.useRelaxedHTTPSValidation();

        given()
                .formParams("username", "hogwarts", "passwd", "666")
                .log().headers()
                .log().body()
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
                .statusCode(200);

    }
}
