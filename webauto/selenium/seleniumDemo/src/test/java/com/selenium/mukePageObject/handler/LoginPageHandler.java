package com.selenium.mukePageObject.handler;

import com.selenium.mukePageObject.page.LoginPage;
import com.selenium.mukePageObject.base.DriverBase;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class LoginPageHandler {
    public DriverBase driverBase;
    public LoginPage loginPage;

    public LoginPageHandler(DriverBase driverBase) {
        this.driverBase = driverBase;
        loginPage=new LoginPage(driverBase);
    }
    public  void sendKeysUser(String username) throws IOException {
        loginPage.sendKeys(loginPage.getUserElement(),username);
    }
    public  void sendKeysPass(String password) throws IOException {
        loginPage.sendKeys(loginPage.getPassElement(),password);
    }
    public void clickLoginButton() throws IOException {
        loginPage.click(loginPage.getLoginButtonElement());
    }
    /**
     * 判断是否登录页面
     */
    public boolean assertLoginPage() throws IOException {
        return loginPage.assertElementIs(loginPage.getUserElement());
    }

}
