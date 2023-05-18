package com.hogwarts.junit5assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsDemoTest {

        // 定义了一个函数
        void fn(int a, int b){
            System.out.println(a / b);
        }

        @Test
        void testAssertThrows() {
            // 异常断言
            assertThrows(ArithmeticException.class, () -> fn(1, 1));
        }
    }


