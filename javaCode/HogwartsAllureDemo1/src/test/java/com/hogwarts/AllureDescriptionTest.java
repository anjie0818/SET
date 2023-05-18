package com.hogwarts;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class AllureDescriptionTest {

    @Test
    @Description("静态描述信息")
    public void annotationDescriptionTest() {
    }

    @Test
    public void dynamicDescriptionTest() {
        assert 1 + 1 == 2;
        Allure.description("动态描述信息111");
        assert 2 + 2 == 4;
        Allure.description("动态描述信息222");
    }
}