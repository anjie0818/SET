package com.selenium.ahic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @创建人 anjie
 * @创建时间 2019/3/19
 * @描述
 */
public class test {
    WebDriver driver;
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjie\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("========"+Thread.currentThread().getId());
        driver.navigate().to("https://www.cnblogs.com/cation/p/8954918.html");

    }
    @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjie\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("========"+Thread.currentThread().getId());
        driver.navigate().to("https://www.cnblogs.com/cation/p/81954918.html");

    }
    @Test
    public void test3(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjie\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("========"+Thread.currentThread().getId());
        driver.navigate().to("https://www.cnblogs.com/cation/p/89541918.html");

    }

}
