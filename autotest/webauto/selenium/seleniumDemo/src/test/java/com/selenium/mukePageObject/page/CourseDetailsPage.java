package com.selenium.mukePageObject.page;

import com.selenium.mukePageObject.util.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.selenium.mukePageObject.base.DriverBase;

import java.io.IOException;
import java.util.*;

/**
 * @创建人 anjie
 * @创建时间 2019/2/25
 * @描述
 */
public class CourseDetailsPage extends BasePage {
    public CourseDetailsPage(DriverBase driver) {
        super(driver);
    }
    public WebElement getActiveButton() throws IOException {
        WebElement activeButton = element(GetByLocator.getLocator("activeButton"));
        return activeButton;
    }
    public List<String> selectAllCoursesText() throws IOException {
        WebElement selectAllCourses = element(GetByLocator.getLocator("selectAllCourses"));
        List<WebElement> allCoursesEle = elements(selectAllCourses, GetByLocator.getLocator("shizan-name"));
        List<String> allCoursesText=new ArrayList<String>();
        for (WebElement webElement:allCoursesEle
             ) {
            allCoursesText.add(webElement.getText());
        }
        return  allCoursesText;
    }
       public WebElement selectOneCourse(String courseName) throws IOException {
           String[] CourseArray = courseName.split(" ");
           List<String> list = Arrays.asList(CourseArray);
           Collections.sort(list, new Comparator<String>() {
               public int compare(String o1, String o2) {
                   return o1.length() < o2.length() ? 1 : -1;
               }
           });
           System.out.println("//*[contains(text(),'"+CourseArray[0]+"')]");
        WebElement courseEle = element(By.xpath("//*[contains(text(),'"+CourseArray[0]+"')]"));
        return courseEle;
    }

    public static void main(String[] args) {
            String[] array = new String[]{"123", "sefwer", "z", "sfs", "eytrywer"};
            List<String> list = Arrays.asList(array);
            Collections.sort(list, new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return o1.length() < o2.length() ? 1 : -1;
                }
            });
            System.out.println(Arrays.toString(array));

    }
}
