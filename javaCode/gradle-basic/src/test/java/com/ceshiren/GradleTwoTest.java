/*
 * @Author: 霍格沃兹测试开发学社-盖盖
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.ceshiren;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradleTwoTest {

    @Test
    public void first(){
        System.out.println("GradleTwoTest这是第1个测试用例");
        assertEquals(9,5+4);
    }
    @Test
    @Tag("good")
    public void second(){
        System.out.println("GradleTwoTest这是第2个测试用例");
        assertEquals(9,5+4);
    }
    @Test
    public void third(){
        System.out.println("GradleTwoTest这是第3个测试用例");
        assertEquals(9,5+4);
    }
}
