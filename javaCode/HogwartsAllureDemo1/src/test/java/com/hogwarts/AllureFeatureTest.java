package com.hogwarts;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

@Feature("登录操作")
public class AllureFeatureTest {

    @Test
    @Story("登录成功")
    public void testSomething() throws Exception {
        System.out.println("success-0000");
    }

    @Test
    @Story("登录成功")
    public void testSomething_ok1() throws Exception {
        System.out.println("success-111");
    }

    @Test
    @Story("登录失败")
    public void testSomething1() throws Exception {
        System.out.println("fail 11111");
    }

    @Test
    @Story("登录失败")
    public void testSomething1_fail1() throws Exception {
        System.out.println("fail 2222");
    }

    @Test
    @Story("登录失败")
    public void testSomething1_fail2() throws Exception {
        System.out.println("fail 11111");
    }

    @Test
    @Story("登录异常情况")
    public void testSomething2() throws Exception {
        System.out.println("error 3333");
    }
}