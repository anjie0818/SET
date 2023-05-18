package com.webAliceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSTest {
    public static WebDriver driver;

    @BeforeAll
    public static void initData(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //窗口最大化
        driver.manage().window().maximize();
    }

    @Test
    public void jsTest(){
        //访问12306
        driver.get("https://www.12306.cn/index/");
        //把driver做一次强转
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        //获取当前时间并且赋予新的值为2020-05-02
        jsDriver.executeScript("document.getElementById('train_date').value = '2020-05-02'");
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印赋予后的值
        System.out.println(jsDriver.executeScript("return document.getElementById('train_date').value"));
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
