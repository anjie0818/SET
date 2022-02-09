package org.study.demo.param;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;
import static org.junit.jupiter.params.provider.EnumSource.Mode.MATCH_ALL;

public class EnumSourceTest {

    public enum PeopleUnit{

        Harry("Harry", 18),
        AD("AD", 19),
        AD1("AD1", 12);

        private final String name;
        private final Integer age;
        private PeopleUnit(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
    @ParameterizedTest
    @EnumSource
    void testWithEnumSource(PeopleUnit unit){
        System.out.println(unit.age+"---"+unit.name);
    }

    @ParameterizedTest
    //通过 names 参数指定使用的枚举值
    @EnumSource(names = {"Harry","AD"})
    void testWithEnumSourceInclude(PeopleUnit unit){
        System.out.println(unit.age+"---"+unit.name);
    }
    @ParameterizedTest
    // 通过 mode 参数指定规则
    // mode 值为 EXCLUDE 代表取反，即指定名称不为Harry的枚举值
    @EnumSource(mode = EXCLUDE, names = {"Harry"})
        // 枚举类作为参数传入测试方法
    void testWithEnumSourceExclude(PeopleUnit unit) {
        assertTrue(EnumSet.of(unit.AD1,unit.AD).contains(unit));
    }
    @ParameterizedTest
    // @EnumSource 注解表示使用枚举类型,
    // 通过 mode 参数指定规则
    // mode 值为 EXCLUDE 代表取反，即指定名称不为Harry的枚举值
    @EnumSource(mode = MATCH_ALL, names = {".*ry"})
        // 枚举类作为参数传入测试方法
    void testWithEnumSourceRegex(PeopleUnit unit) {
        assertTrue(unit.name().endsWith("ry"));    }
}
