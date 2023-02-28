package com.selenium.mukePageObject.testCase;

import com.selenium.mukePageObject.business.CoursesPro;
import com.selenium.mukePageObject.util.HandleCookie;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/25
 * @描述
 */
public class CourseCase extends CaseBase {
    private static Logger logger = Logger.getLogger(loginCase.class);
    public CoursesPro coursesPro;
    public HandleCookie handleCookie;
    @BeforeClass
    public void CourseCase() throws IOException {
        this.driverBase = initDriver("chrome");
        coursesPro = new CoursesPro(driverBase);
        this.handleCookie=new HandleCookie(driverBase);
        driverBase.open("https://coding.imooc.com/");
        handleCookie.setCookie();
        driverBase.open("https://coding.imooc.com/");
        driverBase.maximize();
    }

    @Test
    public void getCourseHome() throws IOException {
        Assert.assertEquals(1,2);
        coursesPro.clickCourse();
    }

}
