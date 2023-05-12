package org.study.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
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
    @Link("https://example.org")
    @Link(name = "allure", type = "mylink")
    @Test
    void method3(){
        System.out.println("------method2------");
        Allure.link("动态链接","http://www.baidu.com");
    }
    @Issue("123")
    @Issue("432")
    @Test
    void method4(){
        System.out.println("------method2------");
        Allure.link("动态链接","http://www.baidu.com");
    }
    @TmsLink("test-1")
    @TmsLink("test-2")
    @Test
    void method5(){
        System.out.println("------method2------");
        Allure.link("动态链接","http://www.baidu.com");
    }
}
