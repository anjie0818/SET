package com.webAliceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.concurrent.TimeUnit;

public class InterActiveTest {
    public static WebDriver driver;

    public static Actions actions;

    @BeforeAll
    public static void initData(){
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void clickTest(){
        driver.get("http://sahitest.com/demo/clicks.htm");
        //单击
        actions.click(driver.findElement(By.xpath("//input[@value='click me']")));
        //双击
        actions.doubleClick(driver.findElement(By.xpath("//input[@value='dbl click me']")));
        //右键
        actions.contextClick(driver.findElement(By.xpath("//input[@value='right click me']")));
        actions.perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void dragTest(){
        driver.get("https://sahitest.com/demo/dragDropMooTools.htm");
        WebElement drag = driver.findElement(By.id("dragger"));
        WebElement drop = driver.findElement(By.xpath("//*[@class='item'][last()]"));
        actions.dragAndDrop(drag,drop).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    //键盘事情只能在火狐操作
    public void  keyBoardTest(){
        driver.get("https://sahitest.com/demo/label.htm");
        driver.findElements(By.xpath("//input[@type='textbox']")).get(0).sendKeys("ashin");

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        actions.keyDown(driver.findElements(By.xpath("//input[@type='textbox']")).get(1),Keys.CONTROL).sendKeys("v").perform();
    }

    @Test
    public void moveTest(){
        driver.get("https://www.baidu.com/");
        actions.moveToElement(driver.findElement(By.id("s-usersetting-top")));
        actions.perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void scrollTest(){
        driver.get("https://www.baidu.com/");
        //向输入框输入"霍格沃兹测试学院"
        driver.findElement(By.id("kw")).sendKeys("霍格沃兹测试学院");
        TouchActions actions = new TouchActions(driver);
        //点击“百度一下”
        driver.findElement(By.id("su")).click();
        // actions.click(driver.findElement(By.id("su")));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        //滑动操作
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        try {
            Thread.sleep(3000);
            //点击下一页
            driver.findElement(By.xpath("//a[@class='n']")).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
