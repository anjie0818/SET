package org.study.demo.order.cls;

import org.junit.jupiter.api.*;
// 指定类执行顺序的方式，DisplayName表示通过DisplayName排序
@TestClassOrder(ClassOrderer.DisplayName.class)
public class ClassDisplayNameTest {
    // 因为是多类执行，所以需要结合@Nested注解
    @Nested
    @DisplayName("b")
    class PrimaryTests {
        @Test
        void test1() {
            System.out.println("第一条用例");
        }
    }
    @Nested
    @DisplayName("a")
    class SecondaryTests {
        @Test
        void test2() {
            System.out.println("第二条用例");
        }
    }
}