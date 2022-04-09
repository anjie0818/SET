package com.selenium.mukePageObject.handler;

import com.selenium.mukePageObject.page.CourseDetailsPage;
import org.openqa.selenium.WebElement;
import com.selenium.mukePageObject.base.DriverBase;

import java.io.IOException;
import java.util.List;

/**
 * @创建人 anjie
 * @创建时间 2019/2/25
 * @描述
 */
public class CourseDetailsHandler {
    public DriverBase driverBase;
    public CourseDetailsPage courseDetailsPage;
    public CourseDetailsHandler(DriverBase driverBase) {
        this.driverBase = driverBase;
        courseDetailsPage=new CourseDetailsPage(driverBase);
    }
    public void clickCourse() throws IOException, InterruptedException {
        // 获取课程列表List
        List<String> courses = courseDetailsPage.selectAllCoursesText();
        for (String courseStr:courses
             ){
            //根据课程名称，遍历点击
            WebElement courseOne = courseDetailsPage.selectOneCourse(courseStr);
            closeActive();
            courseDetailsPage.click(courseOne);
            courseDetailsPage.backPage();
        }
    }
    public void closeActive() throws IOException {
        WebElement closeActive = courseDetailsPage.getActiveButton();
        courseDetailsPage.click(closeActive);
    }
}

