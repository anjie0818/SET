package com.study.assured.ch14_base64;

import io.restassured.RestAssured;
import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.specification.ProxySpecification.host;

public class TestHttpbinBase64 {

    @Test
    void testDecode(){

        // 定义本地代理配置
        RestAssured.proxy = host("127.0.0.1").withPort(8888);
        // 忽略HTTPS校验
        RestAssured.useRelaxedHTTPSValidation();

        //定义一个明文数据
        byte[] data = "hogwarts".getBytes(StandardCharsets.UTF_8);
        String secretMsg = Base64.encodeBase64String(data);

        LinkedHashMap<String, String> respForm =given()
                .formParam("msg", secretMsg)
                .when()
                .post("https://httpbin.ceshiren.com/post")
                .then()
                .extract().path("form");

        // 提取密文
        String encodedMsg = respForm.get("msg");
        System.out.println(encodedMsg);

        // 解密 decodeBase64()
        byte[] arr = Base64.decodeBase64(encodedMsg);
        String msg = new String(arr, StandardCharsets.UTF_8);
        System.out.println(msg);

        // 响应断言
        Assertions.assertEquals("hogwarts", msg);

    }
}
