package org.study.demo.execorder;


import org.junit.jupiter.api.*;


public class Base2Test extends Base1Test{
    @BeforeAll
    public static void beforeAll2(){
//        System.out.println("Base2Test---beforeAll1 执行！");
        System.out.println("我要去找宿舍的同伴！");

    }
    @AfterAll
    public static void afterAll2(){
//        System.out.println("Base2Test---afterAll 执行！");
        System.out.println("我从宿舍搬出来啦！");
    }
    @BeforeEach
    public void beforEach2(){
//        System.out.println("Base2Test---BeforeEach 执行！");
        System.out.println("我要熬夜奋战复习啦！");

    }
    @AfterEach
    public void afterEach2(){
//        System.out.println("Base2Test---AfterEach 执行！");
        System.out.println("成绩出来了，我们去happy！");

    }

    @Test
    public void testMethod03() {
//        System.out.println("testMethod02 执行！");
        System.out.println("大三的专业课考了73分！");

    }
    @Test
    public void testMethod04() {
//        System.out.println("testMethod02 执行！");
        System.out.println("大四的专业课考了83分！");

    }
}