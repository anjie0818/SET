package org.study.demo;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

/**
 * 五种级别 ：
 * BLOCKER("blocker"),  阻塞缺陷（功能未实现，无法下一步）
 * CRITICAL("critical"),    严重缺陷（功能点缺失）
 * NORMAL("normal"),    一般缺陷（边界情况，格式错误）
 * MINOR("minor"),     次要缺陷（界面错误与ui需求不符）
 * TRIVIAL("trivial");    轻微缺陷（必须项无提示，或者提示不规范）
 */
public class AllureSeverityTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    void method1(){
        System.out.println("--------method1-------");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    void method12(){
        System.out.println("--------method2-------");
    }
}
