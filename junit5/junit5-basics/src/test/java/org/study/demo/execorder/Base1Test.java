package org.study.demo.execorder;


import org.junit.jupiter.api.*;


public class Base1Test {
    @BeforeAll
    public static void beforeAll1(){
//        System.out.println("Base1Test---beforeAll1 执行！");
        System.out.println("我要去上大学去了！");

    }
    @AfterAll
    public static void afterAll1(){
//        System.out.println("Base1Test---afterAll 执行！");
        System.out.println("我毕业啦！");
    }
    @BeforeEach
    public void beforEach1(){
//        System.out.println("Base1Test---BeforeEach 执行！");
        System.out.println("要开始进行升级考试啦！");

    }
    @AfterEach
    public void afterEach1(){
//        System.out.println("Base1Test---AfterEach 执行！");
        System.out.println("我考试通过，要升级啦！");

    }
    @Test
    public void testMethod01() {
//        System.out.println("Base1Test---testMethod01 执行！");
        System.out.println("大一的数学考了95分！");

    }
    @Test
    public void testMethod02() {
//        System.out.println("testMethod02 执行！");
        System.out.println("大二的数学考了93分！");

    }
}