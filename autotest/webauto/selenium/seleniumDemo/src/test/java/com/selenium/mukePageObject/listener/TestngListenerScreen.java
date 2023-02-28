package com.selenium.mukePageObject.listener;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.selenium.mukePageObject.testCase.CaseBase;

import java.io.File;
import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class TestngListenerScreen extends TestListenerAdapter {
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        System.out.println("onTestFailure....");
        Object dd = tr.getInstance();
        WebDriver driver=((CaseBase)tr.getInstance()).driverBase.driver;
        try {
            this.takeScreenShot(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void takeScreenShot(WebDriver driver) throws IOException {
        String path = String.valueOf(System.currentTimeMillis())+".png";
        String curPath = System.getProperty("user.dir");
        String screenPath=curPath+"/testImages/"+path;
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File(screenPath));
    }
}
