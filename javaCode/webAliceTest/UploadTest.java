package com.webAliceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadTest {
    public static WebDriver driver;

    @BeforeAll
    public static void initData(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //窗口最大化
        driver.manage().window().maximize();
    }

    @Test
    public void uploadTest(){
        driver.get("https://www.baidu.com/");
        //点击相机
        driver.findElement(By.xpath("//span[@class='soutu-btn']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //选择图片
        driver.findElement(By.xpath("//input[@class='upload-pic']")).sendKeys("C:/Users/Acer/Desktop/study.png");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
