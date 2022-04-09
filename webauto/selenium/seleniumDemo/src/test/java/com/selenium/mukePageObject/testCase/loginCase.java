package com.selenium.mukePageObject.testCase;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.mukePageObject.business.LoginPro;
import com.selenium.mukePageObject.util.GetByLocator;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class loginCase extends CaseBase {
    private static Logger logger = Logger.getLogger(loginCase.class);

    public LoginPro loginPro;
    /**
     * 构造函数初始化是在Testng加载的时候进行的
     */
    @BeforeClass
    public void loginCase(){
        this.driverBase=initDriver("chrome");
        loginPro=new LoginPro(driverBase);
    }
    @Test
    public void getLoginHome() throws IOException {
        driverBase.open("http://www.imooc.com");
        driverBase.maximize();
        driverBase.element(GetByLocator.getLocator("toLoginButton")).click();
    }
    @Test(dependsOnMethods = "getLoginHome")
    public void testLogin() throws IOException, InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(1,3);
        loginPro.login("15652761388","anjie123B");

    }

}
