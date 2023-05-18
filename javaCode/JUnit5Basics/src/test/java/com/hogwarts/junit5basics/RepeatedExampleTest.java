package com.hogwarts.junit5basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

// 重复测试
public class RepeatedExampleTest {
//    @Test // 如果和@RepeatedTest 结合使用，那么就多一次测试
//    @RepeatedTest(5)  // 使用RepeatedTest注解实现多次重复测试，注意不要和@Test结合
    // 在name = "" 中，所有 的{}中都是变量， 其他的都是固定的格式
    // displayName代表显示名称，如果没有设定，那么会使用方法名称
    // currentRepetition 当前是第几次重复
    // totalRepetitions 总共需要重复几次
    @RepeatedTest(value = 3, name = " {displayName} {currentRepetition} -- {totalRepetitions}")
    @DisplayName("hogwartsSchool")
    void hogwarts(){
        System.out.println("霍格沃兹测试学社支付成功");
    }

}
