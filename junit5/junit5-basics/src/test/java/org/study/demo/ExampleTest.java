package org.study.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("测试DisplayName-ExampleTest")
class ExampleTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("----beforeAll----");
    }
    @AfterAll
    static void AfterAll(){
        System.out.println("----AfterAll----");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("----beforeEach----");
    }
    @AfterEach
    void afterEach(){
        System.out.println("----afterEach----");
    }
    @Test
    @DisplayName("测试DisplayName-method1")
    void method1() {
        System.out.println("ExampleTest----method1");
        assertEquals(1,1);
    }
    @Test
    @DisplayName("测试DisplayName-method2")
    void method2() {
        System.out.println("ExampleTest----method2");
        assertEquals(1,1);
    }
}