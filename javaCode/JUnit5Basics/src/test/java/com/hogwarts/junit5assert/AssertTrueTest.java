package com.hogwarts.junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueTest {
    @Test
    // 第一个测试用例，断言表达式的结果
    void expressionDemo(){
        System.out.println("断言表达式为True");
        assertTrue(3<1);
    }
    @Test
    void boolDemo(){
        System.out.println("断言布尔类型");
        // 只要括号内的结果是ture 就正确，反之则断言失败
        assertTrue(false);
    }

}
