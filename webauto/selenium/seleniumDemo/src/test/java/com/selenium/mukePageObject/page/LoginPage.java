package com.selenium.mukePageObject.page;

import org.openqa.selenium.WebElement;
import com.selenium.mukePageObject.base.DriverBase;
import com.selenium.mukePageObject.util.GetByLocator;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class LoginPage extends BasePage {
    public LoginPage(DriverBase driver) {
        super(driver);
    }
    /**
     * 获取用户名输入框
     */
    public WebElement getUserElement() throws IOException {
        return element(GetByLocator.getLocator("mobileInput"));
    }
    /**
     * 获取密码输入框
     */
    public WebElement getPassElement() throws IOException {
        return element(GetByLocator.getLocator("passwordInput"));
    }
    /**
     * 获取登录按钮
     */
    public WebElement getLoginButtonElement() throws IOException {
        return element(GetByLocator.getLocator("loginButton"));
    }


}
