package org.study.demo.ass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    void testAssertEquals(){
        assertEquals(2,2);
    }
    @Test
    void testAssertTrueExpression() {
        // 断言对象是表达式
        assertTrue(3 > 1);
    }

    @Test
    void testAssertTrueBoolean() {
        // 断言对象是布尔类型
        assertTrue(true);
    }

    @Test
    void testAssertNotNullTrue() {
        // 断言对象如果不是null则返回true
        assertNotNull("hogwarts");
    }

    @Test
    void testAssertNotNullFalse() {
        // 断言对象如果是null则返回false
        assertNotNull(null);
    }
}
