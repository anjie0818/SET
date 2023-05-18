/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch16_access_token;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestAccessToken {
    @Test
    void testAccessToken(){

        // 基地址
        RestAssured.baseURI = "https://qyapi.weixin.qq.com/cgi-bin";

        String corpid = "wwba73337113330020";
        String corpsecret = "mr-mdbDGsRLYUPHg3G0pomFzn6NXzkduwo2PHMReI-Q";

        String myToken = given()
                .param("corpid", corpid)
                .param("corpsecret", corpsecret)
        .when()
                .get("/gettoken")
        .then()
//                .log().all()
                .statusCode(200)
                .extract().path("access_token");

        System.out.println(myToken);
    }
}
