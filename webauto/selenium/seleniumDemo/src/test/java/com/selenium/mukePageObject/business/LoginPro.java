package com.selenium.mukePageObject.business;

import com.selenium.mukePageObject.base.DriverBase;
import com.selenium.mukePageObject.handler.LoginPageHandler;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class LoginPro {
    public LoginPageHandler loginPageHandler;
    public LoginPro(DriverBase driverBase) {
        this.loginPageHandler = new LoginPageHandler(driverBase);
    }
    public void login (String username,String password) throws IOException {
        if (loginPageHandler.assertLoginPage()){
            loginPageHandler.sendKeysUser(username);
            loginPageHandler.sendKeysPass(password);
            loginPageHandler.clickLoginButton();
        }else {
            System.out.println("页面不存在或者状态不正确");
        }
    }
}
