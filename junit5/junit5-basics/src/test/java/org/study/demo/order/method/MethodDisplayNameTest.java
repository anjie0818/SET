package org.study.demo.order.method;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class MethodDisplayNameTest {
    @Test
    @DisplayName("8")
    void orderOne(){
        System.out.println("orderOne");
    }
    @Test
    @DisplayName("2")
    void orderTwo(){
        System.out.println("OrderTwo");
    }
    @Test
    @DisplayName("1")
    void orderThree(){
        System.out.println("orderThree");
    }
}
