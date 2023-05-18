package com.hogwarts.junit5rules;

import org.junit.jupiter.api.Test;

public class DemoHogwarts {
    // IDEA 并没有针对文件名做限制
    // 使用maven构建时，则不会收集不满足规则要求的用例
    @Test// 一定要添加注解
    void demo(){
        System.out.println("测试文件DemoHogwarts");
    }
}
