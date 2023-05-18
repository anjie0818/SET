/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch15_envs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class TestEnvYaml {

    @Test
    void testEnvs() throws IOException {

        // 实例化一个ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        // 读取yaml文件
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File yamlFile = new File(classLoader.getResource("envs.yaml").getFile());

        // 定义序列化结构
        TypeReference<HashMap<String, String>> typeRef = new TypeReference<HashMap<String, String>>() {
        };

        // 解析yaml文件内容
        HashMap<String, String> envs = objectMapper.readValue(yamlFile, typeRef);

        RestAssured.baseURI = envs.get(envs.get("default"));
        System.out.println(baseURI);

        given()
        .when()
                .get("/get")
        .then()
                .statusCode(200)
                .log().all();
    }
}

