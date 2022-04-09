package com.study.demo;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.junit.Test;

/**
 * 可以使用 MarkupHelper 创建带有文本细节、 Exception/Throwable、 ScreenCapture 或自定义标记的日志。
 */
public class D_Logging extends BaseExtent{
    /**
     * Details
     */
    @Test
    public void test1(){
        ExtentTest test = extent.createTest("MyFirstTest");
        test.pass("Text details");
        test.log(Status.PASS, "Text details");
    }
    /*
     * 异常
     */
    @Test
    public void test2(){
        Throwable t = new RuntimeException("A runtime exception");
        ExtentTest test = extent.createTest("MyFirstTest");
        test.fail(t);
        test.log(Status.FAIL, t);
    }
    /**
     * Screenshots屏幕截图
     */
    @Test
    public void test3(){
        ExtentTest test = extent.createTest("MyFirstTest");

        // reference image saved to disk
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());

        // base64
        test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
    }
    /**
     * 标记
     */
    @Test
    public void test4(){
        ExtentTest test = extent.createTest("MyFirstTest");
        String json = "{'foo' : 'bar', 'foos' : ['b','a','r'], 'bar' : {'foo':'bar', 'bar':false,'foobar':1234}}";
        test.info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));

    }
}
