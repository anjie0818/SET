package org.study.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class AllureStepTest {

    @Test
    void someTest(){

        Allure.step("步骤1",this::step1);
        Allure.step("步骤1",this::step2);

    }
    @Step("Step1")
    private void step1(){
    }
    @Step("Step2")
    private void step2(){
    }
}
