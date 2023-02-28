package org.study.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactPage extends WeworkLogin{

    public void open(){
        driver.get("https://work.weixin.qq.com/wework_admin/frame#contacts");
    }

    public void addMember(String acctid, String name, String mobile) {
        By addMemberButton = By.linkText("Add members");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addMemberButton));
        driver.findElement(addMemberButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.name("username")).sendKeys(name);

        driver.findElement(By.id("memberAdd_acctid")).click();
        driver.findElement(By.id("memberAdd_acctid")).sendKeys(acctid);

        driver.findElement(By.name("biz_mail")).sendKeys(String.valueOf(System.currentTimeMillis()));
        driver.findElement(By.name("mobile")).sendKeys(mobile);
        driver.findElement(By.linkText("Save")).click();
    }
    public void deleteCurrentMember(){
        driver.findElement(By.linkText("删除")).click();
        driver.findElement(By.linkText("确认")).click();
    }
    public ContactPage getMemeber(String account){
        By memberSearchInput = By.id("memberSearchInput");
        driver.findElement(memberSearchInput).sendKeys(account);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("删除")));
        driver.findElement(memberSearchInput).clear();
        driver.findElement(memberSearchInput).sendKeys(account);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("删除")));
        return this;
    }

}
