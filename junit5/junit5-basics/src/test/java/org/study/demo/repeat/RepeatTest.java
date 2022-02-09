package org.study.demo.repeat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatTest {

    @RepeatedTest(10)
    void testMethod1(){
        System.out.println("----testMethod1-----");
    }
    @RepeatedTest(value = 10,name = "{displayName}+++{currentRepetition}/{totalRepetitions}")
    @DisplayName("重复测试2")
    void testMethod2(){
        System.out.println("----testMethod2-----");
    }
    @RepeatedTest(value = 3,name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("重复测试3")
    void testMethod3(){
        System.out.println("----testMethod3-----");
    }
}
