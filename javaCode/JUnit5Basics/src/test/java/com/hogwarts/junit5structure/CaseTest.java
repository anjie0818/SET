package com.hogwarts.junit5structure;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseTest {
    // 前置条件
    // All 和 Each 的区别
    // 1. All 在一个测试类中，只执行一次 ，但是Each 是有多少个方法就执行几次
    // 2. All 注解修饰 static 方法，不能修饰普通方法。Each可以修饰普通方法
    // 3. 如果是 BeforeAll 和 BeforeEach 同时存在，优先执行BeforeAll
    // 4. 如果是 AfterAll 和 AfterEach 同时存在，优先执行AfterEach 最后执行AfterAll
    @BeforeAll
    static void setUpAll(){
        System.out.println("CaseTest所有用例执行之前的前置动作=========");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("CaseTest所有用例执行之后的后置动作*********");
    }


    @BeforeEach // BeforeEach注解可以实现每条用例执行之前
    void setUp(){
        System.out.println("CaseTest每条用例执行之前的前置动作");
    }
    // 后置动作
    @AfterEach
    void tearDown(){
        System.out.println("CaseTest每条用例执行之后的后置动作");
    }

    @Test
    // 测试标题
    @DisplayName("CaseTest的第一条用例")
    void hogwarts(){
        // 测试方法里面的所有操作都属于测试步骤
        System.out.println("CaseTest的第一条测试用例");
        // 测试用例中的断言信息
        assertEquals(2, 1+1);
    }

    @Test
    // 测试标题
    @DisplayName("CaseTest的第二条用例")
    void hogwarts2(){
        // 测试方法里面的所有操作都属于测试步骤
        System.out.println("CaseTest的第二条测试用例");
        // 测试用例中的断言信息
        assertEquals(2, 1+1);
    }
}
