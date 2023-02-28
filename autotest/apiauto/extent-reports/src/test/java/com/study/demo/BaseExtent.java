package com.study.demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import org.junit.After;
import org.junit.Before;

public class BaseExtent {
    ExtentReports extent ;
    ExtentSparkReporter spark;
    @Before
    public void before(){
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("target/spark.html")
                .viewConfigurer()
                .viewOrder()
                .as(new ViewName[] {
                        ViewName.DASHBOARD,
                        ViewName.TEST,
                        ViewName.AUTHOR,
                        ViewName.DEVICE,
                        ViewName.EXCEPTION,
                        ViewName.LOG,
                        ViewName.CATEGORY
                })
                .apply();
        extent.attachReporter(spark);
    }
    @After
    public void after(){
        extent.flush();
    }
}
