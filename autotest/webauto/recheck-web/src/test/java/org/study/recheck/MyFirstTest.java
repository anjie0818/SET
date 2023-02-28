package org.study.recheck;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import de.retest.recheck.*;

public class MyFirstTest {

    private WebDriver driver;
    private Recheck re;

    @BeforeEach
    public void setUp() {
        re = new RecheckImpl();
        System.setProperty("webdriver.chrome.driver", "/Users/anjie/work/SET/webauto/chromedriver");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless", "--window-size=1280,720");
        driver = new ChromeDriver();
    }

    @Test
    public void google() throws Exception {
        re.startTest();

        driver.get("http://google.com");
        re.check(driver, "open");

        re.capTest();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        re.cap();
    }
}
