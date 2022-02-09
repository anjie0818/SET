package org.study.demo.order.cls;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
// 指定类执行顺序的方式，OrderAnnotation表示通过order注解排序
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class ClassOrderTest {
    @Nested
    @Order(1)
    class PrimaryTests {
        @Test
        void test1() {
        }
    }
    @Nested
    @Order(2)
    class SecondaryTests {

        @Test
        void test2() {
        }
    }
}