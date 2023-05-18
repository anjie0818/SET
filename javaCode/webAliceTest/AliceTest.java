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
        //�����ʽ�ȴ�
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,5);
    }

    @Test
    public void login(){
        driver.get("https://ceshiren.com/");
        //�����¼
        driver.findElement(By.xpath("//span[contains(text(),'��¼')]")).click();
        driver.findElement(By.id("login-account-name")).clear();
        //�����û���
        driver.findElement(By.id("login-account-name")).sendKeys("ceshiren.com");
        //�������������
        driver.findElement(By.id("login-account-password")).clear();
        //��������
        driver.findElement(By.id("login-account-password")).sendKeys("ceshiren.com");
        //�����¼
        driver.findElement(By.xpath("//*[@id='login-button']/span")).click();
    }


    /**
     * ǿ�Ƶȴ�
     */
    @Test
    public void timeSleepTest(){
        driver.get("https://ceshiren.com/");
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'��¼')]")).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void waitTest(){
        driver.get("https://ceshiren.com/");
        //��һ��д��
        // driver.findElement(By.xpath("//span[contains(text(),'��¼')]")).click();
        //����ǹ���copy����
        // wait.until(new ExpectedCondition<WebElement>() {
        //     public WebElement apply(WebDriver driver){
        //         return driver.findElement(By.xpath("//span[contains(text(),'��¼')]"));
        //     }
        // });

        // �ڶ���д��
        // WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'��¼')]")));
        // element.click();

        //������д��
        WebElement loginEle = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//span[contains(text(),'��¼')]"));
            }
        });
        loginEle.click();
    }

    @AfterAll
    public static  void  tearDown(){
        driver.quit();

    }
}
