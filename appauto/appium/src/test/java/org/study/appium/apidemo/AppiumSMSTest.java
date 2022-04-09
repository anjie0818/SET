package org.study.appium.apidemo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumSMSTest {

    private AndroidDriver driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "R28M317E5BP");
        desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
        desiredCapabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {

        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("OS");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("SMS Messaging");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("io.appium.android.apis:id/sms_recipient");
        el4.click();
        el4.sendKeys("18636657014");
        MobileElement el5 = (MobileElement) driver.findElementById("io.appium.android.apis:id/sms_content");
        el5.click();
        el5.sendKeys("你好，我是安杰");
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Send");
        el6.click();

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}


