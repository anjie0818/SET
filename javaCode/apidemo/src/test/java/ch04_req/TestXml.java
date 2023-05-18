/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch04_req;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class TestXml {
    @Test
    void testXml() throws IOException {

        // 定义请求体数据：XML文件
        File file = new File("src/test/resources/add.xml");
        FileInputStream fis = new FileInputStream(file);
        String reqBody = IOUtils.toString(fis, "UTF-8");

        given()
                .contentType("text/xml")  // 设定请求内容媒体类型
                .body(reqBody)  // 定制请求体数据
                .log().headers()
                .log().body()
        .when()
                .post("http://dneonline.com/calculator.asmx")  // 发送POST请求
        .then()
                .log().all()
                .statusCode(200);  // 响应断言
    }
}
