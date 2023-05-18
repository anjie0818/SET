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
        //�������
        driver.manage().window().maximize();
    }

    @Test
    public void alertTest(){
        driver.get("https://www.runoob.com/try/try.php?filename=jqueryui-api-droppable");
        //�л�frame
        driver.switchTo().frame("iframeResult");
        //��������ק�ң���������ק��������õ������
        actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
        try {
            Thread.sleep(5000);
            //���ȷ��
            driver.switchTo().alert().accept();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().parentFrame();
        //��ȡ�ı���Ϣ
        System.out.println(driver.findElement(By.id("submitBTN")).getText());
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
