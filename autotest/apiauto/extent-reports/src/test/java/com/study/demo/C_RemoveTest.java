package com.study.demo;

import com.aventstack.extentreports.ExtentTest;
import org.junit.Test;

public class C_RemoveTest extends BaseExtent{

    /**
     * 使用 removeTest 可以从运行会话中完全删除测试。
     * 注意: 此方法还将删除与测试相关的所有信息，包括日志、屏幕截图、子节点、标记等。
     */
    @Test
    public void test1(){
        ExtentTest test = extent.createTest("Test").fail("reason");
        extent.removeTest(test);

       // or remove using test name
        extent.removeTest("Test");

    }
    @Test
    public void test2(){
        ExtentTest test = extent.createTest("Test");
        ExtentTest node = test.createNode("Node").fail("reason");
        extent.removeTest(node);

        // or remove using test name
        extent.removeTest("node");

    }
}
