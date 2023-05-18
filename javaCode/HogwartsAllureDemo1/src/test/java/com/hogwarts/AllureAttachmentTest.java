package com.hogwarts;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AllureAttachmentTest {
    @Test
    public void addattachTest(){
        // 添加文本展示
        Allure.addAttachment("文本信息", "My attachment content");
        // 添加截图展示
        try {
            Allure.addAttachment("添加图片", "image/jpg",new FileInputStream("/Users/juanxu/Documents/图片/专属海报.jpeg"),".jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
