package org.study.basics.操作浏览器;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Map;

public class DriverTest {

    /**
     * 死等待
     */
    @Test
    void sleepTest() throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://home.testing-studio.com/");
        driver.manage().window().setSize(new Dimension(100,100));
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(100,100));
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();
    }

}
