package com.study.assured.ch04_request_format;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import static io.restassured.RestAssured.given;

public class TestXml {

    @Test
    public void testXml() throws IOException {
        File file = new File("src/test/resources/add.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        String reqBody = IOUtils.toString(fileInputStream, Charset.defaultCharset());

        given()
                .contentType("text/xml")
                .body(reqBody)
                .log().all()
        .when()
                .post("http://dneonline.com/calculator.asmx")
        .then()
                .log().all()
                .statusCode(200);
    }
}
