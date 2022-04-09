package com.study.demo;

import org.junit.Test;

public class E_AttributesTagging extends BaseExtent{
    /**
     * 分配标签
     * TODO
     */
    @Test
    public void test1(){

        // usage
        extent.createTest("Test").assignCategory("tag-1").pass("details");
        extent.createTest("Test2").assignCategory("tag-2").pass("details2");

    }

    /**
     * 分配设备
     */
    @Test
    public void test2(){
        extent.createTest("test1").assignDevice("device-1","device-2").pass("details");
        extent.createTest("test2").assignDevice("device-2").pass("details");
        extent.createTest("test3").assignDevice("device-3").pass("details");

    }
    /**
     * 配置作者
     */
    @Test
    public void test3(){

        // usage
        extent.createTest("MyFirstTest1").assignAuthor("张三").pass("details");
        extent.createTest("MyFirstTest2").assignAuthor("李四").pass("details");
    }
    /**
     * 系统信息
     */
    @Test
    public void test4(){
        extent.setSystemInfo("os", "macos");
        extent.setSystemInfo("env", "test");

    }

}
