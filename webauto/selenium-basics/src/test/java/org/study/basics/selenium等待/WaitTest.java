package org.study.basics.selenium等待;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTest {

    /**
     * 死等待
     */
    @Test
    void sleepTest() throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://home.testing-studio.com/");
        Thread.sleep(5000);
        driver.findElement(By.className("login-button")).click();
        driver.quit();
    }
    /**
     * implicitlyWait
     */
    @Test
    void implicitlyWaitTest(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://home.testing-studio.com/");
        driver.findElement(By.className("login-button1")).click();
        driver.quit();
    }
    /**
     * 显式等待
     */
    @Test
    void webDriverWaitTest(){
        FirefoxDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://home.testing-studio.com/");
        //方法一：函数
        wait.until(ExpectedConditions.elementToBeClickable(By.className("login-button"))).click();
        //方法二：匿名内部类-可以增加更多操作
//        wait.until(new ExpectedCondition<WebElement>() {
//            public WebElement apply(WebDriver driver){
//                return driver.findElement(By.className("login-button"));
//            }
//        });
        driver.quit();
    }
}
