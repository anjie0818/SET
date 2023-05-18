package com.webAliceTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AlertTest {
    public static WebDriver driver;
    public static Actions actions;

    @BeforeAll
    public static void initData(){
        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //窗口最大化
        driver.manage().window().maximize();
    }

    @Test
    public void alertTest(){
        driver.get("https://www.runoob.com/try/try.php?filename=jqueryui-api-droppable");
        //切换frame
        driver.switchTo().frame("iframeResult");
        //将“请拖拽我！”容器拖拽到“请放置到这里！”
        actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
        try {
            Thread.sleep(5000);
            //点击确定
            driver.switchTo().alert().accept();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().parentFrame();
        //获取文本信息
        System.out.println(driver.findElement(By.id("submitBTN")).getText());
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
