package org.study.demo;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AllureAttachmentTest {

    @Test
    void method1(){

        Allure.addAttachment("My attachment","My attachment content");

        // 添加截图展示
        try {
            Allure.addAttachment("add picture", "image/jpg",new FileInputStream("/Users/anjie/work/测试开发/junit5/images/idea生成测试类.jpg"),".jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
