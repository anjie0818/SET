package com.webAliceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
    public static WebDriver driver;

    @BeforeAll
    public static  void initData(){
        String browserName = System.getenv("browser");
        browserName = "chrome";
        if("chrome".equals(browserName)){
            //设置指定键对值的系统属性
            System.setProperty("webdriver.chrome.driver","E:/wu_dong/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }else if("firefox".equals(browserName)){
            System.setProperty("webdriver.gecko.driver","E:/wu_dong/huhuo/geckodriver-v0.29.1-win64/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if("safari".equals(browserName)){
            driver = new SafariDriver();
        }
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }
}
