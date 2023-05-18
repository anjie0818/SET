package com.hogwarts;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AllureStepTest {
    @Test
    public void someTest() throws Exception {
        //Some code...
        Allure.step("步骤1",this::step1Logic);
        Allure.step("步骤2",this::step2Logic);
        Allure.step("步骤3",this::step3Logic);
        //Some more assertions...
    }
    @Step("This is step 1")
    private void step1Logic() {
        // Step1 implementation
        System.out.println("步骤1");
    }
    @Step("This is step 2")
    private void step2Logic() {
        // Step2 implementation
        System.out.println("步骤2");
    }

    @Step("这是步骤3")
    private void step3Logic(){
        assertThat(1,equalTo(2));
    }
}

