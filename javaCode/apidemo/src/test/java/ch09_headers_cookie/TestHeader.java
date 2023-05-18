/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch09_headers_cookie;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestHeader {

    @Test
    void testHeader(){

        // 配置本地代理，方便监听请求和响应信息
        RestAssured.proxy = host("127.0.0.1").withPort(8888);
        // 忽略HTTPS校验
        RestAssured.useRelaxedHTTPSValidation();

        given()
                .headers("My-Header1", "value1", "My-Header2", "value2")
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all()
                .statusCode(200);
    }
}
