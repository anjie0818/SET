package com.webAliceTest;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AliceTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    @BeforeAll
    public static void initData(){
        driver = new ChromeDriver();
        actions = new Actions(driver);
        //添加隐式等待
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,5);
    }

    @Test
    public void login(){
        driver.get("https://ceshiren.com/");
        //点击登录
        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
        driver.findElement(By.id("login-account-name")).clear();
        //输入用户名
        driver.findElement(By.id("login-account-name")).sendKeys("ceshiren.com");
        //清楚输入框的内容
        driver.findElement(By.id("login-account-password")).clear();
        //输入密码
        driver.findElement(By.id("login-account-password")).sendKeys("ceshiren.com");
        //点击登录
        driver.findElement(By.xpath("//*[@id='login-button']/span")).click();
    }


    /**
     * 强制等待
     */
    @Test
    public void timeSleepTest(){
        driver.get("https://ceshiren.com/");
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void waitTest(){
        driver.get("https://ceshiren.com/");
        //第一种写法
        // driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
        //这个是官网copy下来
        // wait.until(new ExpectedCondition<WebElement>() {
        //     public WebElement apply(WebDriver driver){
        //         return driver.findElement(By.xpath("//span[contains(text(),'登录')]"));
        //     }
        // });

        // 第二种写法
        // WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'登录')]")));
        // element.click();

        //第三种写法
        WebElement loginEle = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//span[contains(text(),'登录')]"));
            }
        });
        loginEle.click();
    }

    @AfterAll
    public static  void  tearDown(){
        driver.quit();

    }
}
