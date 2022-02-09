package org.study.demo.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {

    @Test
    @Tag("test")
    void method1(){
        System.out.println("-----method1-----");
    }
    @Test
    @Tag("test")
    @Tag("dev")
    void method2(){
        System.out.println("-----method2-----");
    }
    @Test
    @Tag("prd")
    void method3(){
        System.out.println("-----method3-----");
    }
    @Test
    @Tag("prdprd")
    void method4(){
        System.out.println("-----method4-----");
    }
}
