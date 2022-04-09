package com.selenium.mukePageObject.business;

import com.selenium.mukePageObject.base.DriverBase;
import com.selenium.mukePageObject.handler.CourseDetailsHandler;

import java.io.IOException;

/**
 * @创建人 anjie
 * @创建时间 2019/2/25
 * @描述
 */
public class CoursesPro {
    CourseDetailsHandler courseDetailsHandler;
    public CoursesPro(DriverBase driverBase) {
        this.courseDetailsHandler = new CourseDetailsHandler(driverBase);
    }
    public void clickCourse(){
        try {
            courseDetailsHandler.clickCourse();
        } catch (IOException e) {
            System.out.println("页面不存在或者状态不正确");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
