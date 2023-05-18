package com.hogwarts.junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllDemoTest {
    @Test
    void hogwarts(){
        System.out.println("断言测试");
        // 第一个参数是期望结果，第二个参数是实际结果， 对比两个参数是否相等
        assertEquals(2, 1+1);
        System.out.println("传值为2， 1");
        assertEquals(3, 1+1);
        System.out.println("传值为3， 1");
        // 问题： 只要有一个断言失败， 后面的代码全部都不执行
        // 解决： 使用AssertAll 即可实现，所有字段的断言。
        assertEquals(1, 1+1);
        System.out.println("传值为1， 2");
    }
    @Test
    void assertAllDemo(){
        // 分组断言， 如果一个用例存在多个断言，使用assertAll 可以每个断言都执行，且返回结果
        // 第一个heading 参数是一个描述信息，代表了 这个分组断言是针对什么场景， 也可以不传。
        System.out.println("断言测试AssertAll 场景");
        assertAll(
                ()->assertEquals(2, 1+1),
                ()->assertEquals(3, 1+1),
                ()->assertEquals(4, 1+1));
    }
}
