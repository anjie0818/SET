package com.webAliceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WindowTest {
    public static WebDriver driver;

    @BeforeAll
    public static void initData(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //窗口最大化
        driver.manage().window().maximize();
    }

    @Test
    public void switchWindowTest(){
        driver.get("https://www.baidu.com/");
        //点击登录
        driver.findElement(By.id("s-top-loginbtn")).click();
        String baiduWin = driver.getWindowHandle();
        System.out.println(baiduWin);
        //点击注册
        driver.findElement(By.id("TANGRAM__PSP_11__regLink")).click();
        Object registerWin = driver.getWindowHandles();
        System.out.println(registerWin);

        for(String win:driver.getWindowHandles()) {
            if (!win.equals(baiduWin)){
                //切换Window
                driver.switchTo().window(win);
                //注册没成功主要是因为手机号码
                driver.findElement(By.id("TANGRAM__PSP_4__userName")).sendKeys("abcabc861761");
                driver.findElement(By.id("TANGRAM__PSP_4__phone")).sendKeys("15676001234");
                driver.findElement(By.id("TANGRAM__PSP_4__password")).sendKeys("abcabc861761");
                driver.findElement(By.id("TANGRAM__PSP_4__verifyCodeSend")).click();
                driver.findElement(By.id("TANGRAM__PSP_4__verifyCode")).sendKeys("123456");
                driver.findElement(By.id("TANGRAM__PSP_4__submit")).click();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //切换百度页面
                driver.switchTo().window(baiduWin);

                //点击登录
                driver.findElement(By.id("s-top-loginbtn")).click();
                driver.findElement(By.id("TANGRAM__PSP_11__userName")).sendKeys("123");
                driver.findElement(By.id("TANGRAM__PSP_11__password")).sendKeys("123");
            }
        }
    }

    @Test
    public void frameTest(){
        driver.get("https://www.runoob.com/try/try.php?filename=jqueryui-api-droppable");
        //使用iframeid切换frame
        driver.switchTo().frame("iframeResult");
        System.out.println(driver.findElement(By.id("draggable")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.id("submitBTN")).getText());
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
