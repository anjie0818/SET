package org.study.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class AllureDescriptionTest {

    @Test
    @Description("静态描述")
    void annotationDescriptionTest(){
        System.out.println("-------annotationDescriptionTest------");
    }
    @Test
    void dynamicDescriptionTest(){
        System.out.println("-------dynamicDescriptionTest---------");
        Allure.description("dynamicDescriptionTest");
    }


}
