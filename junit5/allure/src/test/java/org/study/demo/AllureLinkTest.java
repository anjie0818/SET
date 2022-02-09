package org.study.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Test;

public class AllureLinkTest {

    @Test
    @Link(name = "静态链接",url = "http://www.baidu.com")
    void method1(){
        System.out.println("------method1------");
    }

    @Test
    void method2(){
        System.out.println("------method2------");
        Allure.link("动态链接","http://www.baidu.com");
    }
}
