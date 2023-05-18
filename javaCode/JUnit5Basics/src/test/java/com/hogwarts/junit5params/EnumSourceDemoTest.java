/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.junit5params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceDemoTest {
    // 1. 定义枚举类
    public enum HogwartsUnit{
        Harry("Harry", 18),
        AD("AD", 20),
        AD2("AD2", 22);
        private final String name;
        private final Integer age;
        private HogwartsUnit(String name, Integer age){
            this.name = name;
            this.age = age;
        }
    }
//    2. 对测试方法添加 ParameterizedTest 注解以及EnumSource 注解
    @ParameterizedTest
    @EnumSource
    // 3. 测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo(HogwartsUnit unit){
        System.out.println(unit.name+"的年龄是："+unit.age);
    }

    @ParameterizedTest
    // 通过names 关键字，指定枚举对象的范围
    @EnumSource(names = {"AD", "AD2"})
        // 3. 测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo2(HogwartsUnit unit){
        System.out.println(unit.name+"的年龄是："+unit.age);
    }

    @ParameterizedTest
    // 通过names 关键字，指定枚举对象的范围
    // 通过mode 关键字，指定规则， EXCLUDE 规则代表取反， 意思就是
    // names 里面指定了什么，就不执行什么
    @EnumSource(mode = EnumSource.Mode.EXCLUDE ,names = {"AD"})
        // 3. 测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo3(HogwartsUnit unit){
        System.out.println(unit.name+"的年龄是："+unit.age);
    }

    @ParameterizedTest
    // 通过names 关键字，指定枚举对象的范围
    // 通过mode 关键字，指定规则， MATCH_ALL代表正则匹配
    // names里面填写正则表达式，如果正则表达式和枚举类对象匹配，则使用此枚举对象
    @EnumSource(mode = EnumSource.Mode.MATCH_ALL ,names = {"AD.*"})
        // 3. 测试方法的形参声明类型是定义的枚举类
    void enumSourceDemo4(HogwartsUnit unit){
        System.out.println(unit.name+"的年龄是："+unit.age);
    }

}
