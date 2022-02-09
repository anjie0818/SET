package org.study.demo.order.method;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodRandomTest {
    @Test
    void order1(){
        System.out.println("order1");
    }
    @Test
    void order3(){
        System.out.println("order3");
    }
    @Test
    void order2(){
        System.out.println("order2");
    }
}
