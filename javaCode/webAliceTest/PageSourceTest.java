package com.webAliceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PageSourceTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public static WebDriver webDriver;
    public static Actions  actions;

    @BeforeAll
    public static void initData(){
        webDriver = new ChromeDriver();
        actions = new Actions(webDriver);
        //窗口最大化
        webDriver.manage().window().maximize();
        //设置隐式等待
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    // @Test
    // void baiduTest(){
    //     webDriver.get("https://www.baidu.com/");
    //     WebElement search = webDriver.findElement(By.id("su"));
    //     //获取search的value属性值并打印
    //     System.out.println(search.getAttribute("value"));
    //     //打印search的位置坐标
    //     System.out.println(search.getLocation());
    //     //打印search的元素大小
    //     System.out.println(search.getSize());
    // }

    @Test
    void baiduTest(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");
        // webDriver.manage().window().

    }


    @AfterAll
    public static void teardown(){
        webDriver.quit();
    }

}
