package org.study.demo.ass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsTest {
    void fn(int a, int b){
        System.out.println(a / b);
    }

    @Test
    void testAssertThrows() {
        // 异常断言
        assertThrows(ArithmeticException.class, () -> fn(1, 0));
    }
}
