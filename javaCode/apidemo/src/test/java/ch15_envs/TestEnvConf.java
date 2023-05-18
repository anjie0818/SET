/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch15_envs;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TestEnvConf {

    @Test
    void testEnvs(){

        // 实例化环境配置对象
        HashMap<String, String> envs = new HashMap<>();
        envs.put("org", "http://httpbin.org");
        envs.put("ceshiren", "https://httpbin.ceshiren.com");
        // 配置设定的环境名称
        envs.put("default", "ceshiren");

        RestAssured.baseURI = envs.get(envs.get("default"));

        given()
        .when()
                .get("/get")
        .then()
                .statusCode(200)
                .log().all();
    }

}
