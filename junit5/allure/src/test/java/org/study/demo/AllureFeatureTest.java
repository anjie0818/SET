package org.study.demo;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

@Feature("登录")
public class AllureFeatureTest {

    @Test
    @Story("登录成功")
    void method1(){
        System.out.println("---method1---");
    }
    @Test
    @Story("登录失败")
    void method2(){
        System.out.println("---method2---");
    }
    @Test
    @Story("登录失败")
    void method3(){
        System.out.println("---method3---");
    }
}
