package com.selenium.mukePageObject.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class DriverBase {
    public WebDriver driver;
    public DriverBase(String  driverName) {
        SelectDriver selectDriver=new SelectDriver();
        this.driver = selectDriver.driverName(driverName);
    }
    public WebElement element(By by){
        return driver.findElement(by);
    }
    public List<WebElement> elements(WebElement fatherWebElement,By by){
        return fatherWebElement.findElements(by);
    }
    public void stop(){
        driver.close();
    }
    public void open(String url){
        driver.get(url);
    }
    public void maximize(){
        driver.manage().window().maximize();
    }
    public void backPage(){
        driver.navigate().back();
    }
    /**
     * 获取cookcie
     * @return
     * */
    public Set<Cookie> getCookie(){
        Set<Cookie> cookies = driver.manage().getCookies();
        return cookies;
    }

    /**
     * 删除cookie
     * */
    public void deleteCookie(){
        driver.manage().deleteAllCookies();
    }
    /**
     * 设置cookie
     * */
    public void setCookie(Cookie cookie){

        driver.manage().addCookie(cookie);

    }
}
