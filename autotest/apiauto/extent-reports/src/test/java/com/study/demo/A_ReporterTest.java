package com.study.demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import org.junit.Test;

public class A_ReporterTest {

    /**
     * 生成报告 一个 or 多个
         * ExtentReports extent = new ExtentReports();
         * ExtentAventReporter avent = new ExtentAventReporter("target/avent.html");
         * ExtentEmailReporter email = new ExtentEmailReporter("target/email.html");
         * extent.attachReporter(avent, email);
     */
    @Test
    public void test1(){
        ExtentReports extent = new ExtentReports();
        /**
         *   观察者模式工具使得所有的记者都成为 ExtentReports 的观察者
         *   eg:ExtentSparkReporter
         *      ExtentKlovReporter
         *      ExtentAventReporter【pro】
         *      ExtentEmailReporter【pro】
         *
         */
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        extent.createTest("MyFirstTest")
                .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
        extent.flush();
    }
    /**
     * Filters 过滤器:安装过滤规则生成对应测试报告
     *      view all tests 查看所有测试
     *      view only failed ones 视图只有失败的
     */
    @Test
    public void test3(){
        ExtentReports extent = new ExtentReports();
        // will only contain failures
        ExtentSparkReporter sparkFail = new ExtentSparkReporter("target/SparkFail.html")
                .filter()
                .statusFilter()
                .as(new Status[] { Status.FAIL })
                .apply();
        // will contain all tests
        ExtentSparkReporter sparkAll = new ExtentSparkReporter("target/SparkAll.html");
        extent.attachReporter(sparkAll,sparkFail);
        extent.createTest("MyFirstTest-success")
                .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");

        extent.createTest("MyFirstTest-fail")
                .log(Status.FAIL, "This is a logging event for MyFirstTest, and it fail!");
        extent.flush();
    }
    /**
     *  配置查看view顺序
         *  Test (default: primary) 测试(默认值: 主)
         * Category 类别
         * Device 设备
         * Author 作者
         * Exception 例外
         * Dashboard 仪表盘
         * Log 原木
     * 【注】只有 Avent 和 Spark 记录器支持此配置。
     */
    @Test
    public void test4(){
        ExtentReports extent = new ExtentReports();

        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html")
                .viewConfigurer()
                .viewOrder()
                .as(new ViewName[] {
                        ViewName.DASHBOARD,
                        ViewName.TEST,
                        ViewName.AUTHOR,
                        ViewName.DEVICE,
                        ViewName.EXCEPTION,
                        ViewName.LOG
                })
                .apply();
        extent.attachReporter(spark);
        extent.createTest("MyFirstTest-success")
                .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");

        extent.createTest("MyFirstTest-fail")
                .log(Status.FAIL, "This is a logging event for MyFirstTest, and it fail!");
        extent.flush();
    }
}
