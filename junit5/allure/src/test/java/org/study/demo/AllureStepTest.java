package org.study.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllureStepTest {

    @Test
    void someTest(){

        Allure.step("步骤1",this::step1);
        Allure.step("步骤2",this::step2);

    }
    @Step("Step1")
    private void step1(){
    }
    @Step("Step2")
    private void step2(){
    }

    @Test
    void someTest2(){
        System.out.println(stepTwo(stepOne("1")+" 2"));
        Assertions.assertEquals(1,1);
    }
    @Step("Step1-{param}")
    private String stepOne(String param){
        return param;
    }
    @Step("Step2-{param}")
    private String stepTwo(String param){
        return param;
    }
}
