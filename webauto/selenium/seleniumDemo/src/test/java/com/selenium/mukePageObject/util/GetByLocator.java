package com.selenium.mukePageObject.util;

import org.openqa.selenium.By;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class GetByLocator {
    public static By getLocator(String key) throws IOException {
        ProUtil proUtil=new ProUtil("element.properties");
        String[] values = proUtil.getPro(key).split(">");
        String localType =values[0];
        String locatValue = values[1];
        return byStr(localType,locatValue);
    }
    public static By byStr(String by, String local){
        if (by.equals("linkText")){
            return By.linkText(local);
        }else if (by.equals("xpath")){
            return By.xpath(local);
        }else if (by.equals("name")){
            return By.name(local);
        }else if (by.equals("className")){
            return By.className(local);
        }else if (by.equals("id")){
            return By.id(local);
        }
        return null;
    }
}
