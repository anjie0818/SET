package org.study.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllureDisplayNameTest {

    @Test
    @DisplayName("测试别名")
    void  displayNameTest(){
        System.out.println("------displayNameTest------");
    }
}
