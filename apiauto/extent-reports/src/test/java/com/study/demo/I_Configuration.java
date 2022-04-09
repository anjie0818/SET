package com.study.demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class I_Configuration {
    /**
     * TODO
     *  https://github.com/extent-framework/extentreports-java/tree/master/config
     */
    @Test
    public void test1(){

        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ext/Spark.html");
        //configuration
        spark.config().enableOfflineMode(false);
        extent.attachReporter(spark);
        spark.config(
                ExtentSparkReporterConfig.builder()
                        .theme(Theme.DARK)
                        .documentTitle("MyReport")
                        .build()
        );

// or:
//        ExtentSparkReporter spark = new ExtentSparkReporter("spark.html");
//        spark.config().setTheme(Theme.DARK);
//        spark.config().setDocumentTitle("MyReport");
        extent.createTest("MyFirstTest")
                .log(Status.PASS, "This is a logging event for MyFirstTest, and it pass!");
        extent.flush();
    }
    @Test
    public void test2() throws IOException {

        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ext/Spark.html");
        final File CONF = new File("config/spark-config.xml");
        spark.loadXMLConfig(CONF);
        extent.attachReporter(spark);

        extent.createTest("MyFirstTest")
                .log(Status.PASS, "This is a logging event for MyFirstTest, and it pass!");
        extent.flush();
    }
}
