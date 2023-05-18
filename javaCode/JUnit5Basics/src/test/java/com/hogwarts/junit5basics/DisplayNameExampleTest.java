package com.hogwarts.junit5basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
// @DisplayName适用于方法和类。

//@DisplayName("霍格沃兹演示类")
// 显示的名称为默认的格式
//@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
// Simple 显示的名称如果是没有参数的方法则去掉括号，如果有参数则维持原样
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
// ReplaceUnderscores 替换带_ 的部分为空格
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//IndicativeSentences 将显示名称换位类名, 方法名
@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class DisplayNameExampleTest {

    @Test
    @DisplayName("霍格沃兹第一条用例")
    void hogwartsOne(){
        System.out.println("第一条用例");
    }

    @ParameterizedTest
    @ValueSource(strings = {"霍格沃兹测试开发"})
    void hogwartsTwo(String name){
        System.out.println(name);
        System.out.println("第二条用例");
    }
    @Test
    void hogwarts_Three(){
        System.out.println("第三条用例");
    }

}
