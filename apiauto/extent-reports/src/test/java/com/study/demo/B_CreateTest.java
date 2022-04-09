package com.study.demo;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.*;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * 使用 ExtentReports: : createTest 创建测试。
 *          createTest 方法返回一个 ExtentTest 对象，
 *          该对象可用于发布日志、创建节点、分配属性(标记、设备、作者)或附加截图。
 */
public class B_CreateTest extends BaseExtent {

    /**
     *  创建test
     */
    @Test
    public void test1(){

        ExtentTest test = extent.createTest("MyFirstTest");
        test.pass("Pass");
        // fluent
        ExtentTest test2 = extent.createTest("MyFirstTest").pass("Pass");
    }
    /**
     * ExtentTest 对象 createNode 创建节点。根据输出和报告者类型，此方法在测试中创建一个分段，通常作为一个框或切换
     */
    @Test
    public void test2(){
        ExtentTest test = extent.createTest("MyFirstTest");
        ExtentTest node = test.createNode("Node");
        node.pass("Pass");

        // fluent
        ExtentTest node1 = extent.createTest("MyFirstTest")
                .createNode("Node")
                .pass("Pass");
    }
    /**
     * BDD 动态数据处理
     */
    @Test
    public void test3(){
        ExtentTest feature = extent.createTest(Feature.class, "Refund item");
        ExtentTest scenario = feature.createNode(Scenario.class, "Jeff returns a faulty microwave");
        scenario.createNode(Given.class, "Jeff has bought a microwave for $100").pass("pass");
        scenario.createNode(And.class, "he has a receipt").pass("pass");
        scenario.createNode(When.class, "he returns the microwave").pass("pass");
        scenario.createNode(Then.class, "Jeff should be refunded $100").fail("fail");
        /**
         * 或者
         * ExtentTest feature = extent.createTest(new GherkinKeyword("Feature"), "Refund item");
         * ExtentTest scenario = feature.createNode(new GherkinKeyword("Scenario"), "Jeff returns a faulty microwave");
         * scenario.createNode(new GherkinKeyword("Given"), "Jeff has bought a microwave for $100").pass("pass");
         * scenario.createNode(new GherkinKeyword("And"), "he has a receipt").pass("pass");
         * scenario.createNode(new GherkinKeyword("When"), "he returns the microwave").pass("pass");
         * scenario.createNode(new GherkinKeyword("Then"), "Jeff should be refunded $100").fail("fail");
         */
    }
    /**
     * 设置Gherkin Dialect 小黄瓜方言
     */
    @Test
    public void test4() throws UnsupportedEncodingException, ClassNotFoundException {
        extent.setGherkinDialect("de");
        ExtentTest feature = extent.createTest(new GherkinKeyword("Funktionalität"), "Refund item VM");
        ExtentTest scenario = feature.createNode(new GherkinKeyword("Szenario"), "Jeff returns a faulty microwave");
        ExtentTest given = scenario.createNode(new GherkinKeyword("Angenommen"), "Jeff has bought a microwave for $100").skip("skip");
    }
}
