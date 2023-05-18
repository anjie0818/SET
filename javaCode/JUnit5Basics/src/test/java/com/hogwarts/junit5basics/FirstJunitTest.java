package com.hogwarts.junit5basics;

import org.junit.jupiter.api.Test;

public class FirstJunitTest {
    // 第一个测试用例，所有的测试用例都需要添加 @Test 注解
    // 如果用mvn 命令行执行 1. 安装对应的两个plugin 2. 一定要在对应module 路径下面执行 mvn test
    @Test
    void first(){
        System.out.println("第一个Junit5测试用例");
    }
    @Test
    void second(){
        System.out.println("第二个Junit5测试用例");
    }
}
