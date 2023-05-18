package com.hogwarts.junit5basics;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagExampleTest {
    // 通过 Tag(标签吗)注解 即可设置标签， 每个用例可以有多个Tag
    @Tag("preprod")
    @Test
    void hogwarts1(){
        System.out.println("预发布环境");
    }
    @Tag("dev")
    @Test
    void hogwarts2(){
        System.out.println("开发环境");
    }
    @Tag("test")
    @Test
    void hogwarts3(){
        System.out.println("测试环境");
    }
    @Tag("test")
    @Tag("preprod")
    @Test
    void hogwarts4(){
        System.out.println("测试+预发布环境");
    }
    // 当使用标签时，标签名对应的是，自定义标签的标签名
    @PreprodTest
    void hogwarts5(){
        System.out.println("自定义标签");
    }
    @PreprodTest
    void hogwarts6(){
        System.out.println("自定义标签");
    }
}
