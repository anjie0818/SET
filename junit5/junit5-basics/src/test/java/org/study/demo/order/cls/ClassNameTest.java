package org.study.demo.order.cls;


import org.junit.jupiter.api.*;

// 指定类执行顺序的方式，ClassName代表指定为类名排序
@TestClassOrder(ClassOrderer.ClassName.class)
public class ClassNameTest {
    // 因为是多类执行，所以需要结合@Nested注解
    @Nested
    class PrimaryTests {
        @Test
        void test1() {
            System.out.println("第一条用例");
        }
    }
    @Nested
    class SecondaryTests {
        @Test
        void test2() {
            System.out.println("第二条用例");
        }
    }
    @Nested
    class ThirdTests {
        @Test
        void test2() {
            System.out.println("第三条用例");
        }
    }
}