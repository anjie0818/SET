package org.study.basics.登录测试;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    private static FirefoxDriver driver;

    @BeforeAll
    static void initDriver(){
        driver = new FirefoxDriver();
    }
    @Test
    void login(){
        driver.get("https://home.testing-studio.com/");

        driver.findElement(By.className("login-button")).click();
        driver.findElement(By.id("login-account-name")).sendKeys("anjiework@gmail.com");
        driver.findElement(By.id("login-account-password")).sendKeys("hogwarts");

        driver.findElement(By.id("login-button")).click();
    }
    @AfterAll
    static void close(){
        driver.quit();
    }
}
