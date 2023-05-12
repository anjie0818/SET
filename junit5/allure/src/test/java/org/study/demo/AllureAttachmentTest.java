package org.study.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class AllureAttachmentTest {

    @Test
    void method1(){

        Allure.addAttachment("My attachment","My attachment content");

        // 添加截图展示
        try {
            Allure.addAttachment("add picture", "image/jpg",new FileInputStream("/Users/anjie/work/SET/junit5/images/allure用法.png"),".png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    void method2ByAnno() throws IOException {
        System.out.println("-----method2ByAnno-------");
        performedActions("你好测试method2ByAnno");
        saveScreenshot(imageToBytes("/Users/anjie/work/SET/junit5/images/idea生成测试类.jpg"));
    }
    @Attachment
    public String performedActions(String str) {
        return str;
    }
    @Attachment(value = "Page screenshot", type = "image/jpg",fileExtension =".jpg")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
    /**
     *  通过图片路径将图片文件转化为字符数组
     *
     * @param url 图片路径
     * @return byte[]
     */
    public static byte[] imageToBytes(String url){
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(url));
            ImageIO.write(bufferedImage,"jpg",byteOutput);
            return byteOutput.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (byteOutput != null)
                    byteOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
