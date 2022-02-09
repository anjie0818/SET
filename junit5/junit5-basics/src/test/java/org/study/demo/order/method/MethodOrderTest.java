package org.study.demo.order.method;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * 指定排序方式为通过order注解排序，注意：需要和order注解结合使用
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderTest {
    @Order(1)
    @Test
    void orderOne(){
        System.out.println("orderOne");
    }
    @Order(2)
    @Test
    void orderTwo(){
        System.out.println("orderTwo");
    }
    @Order(3)
    @Test
    void orderThree(){
        System.out.println("orderThree");
    }



}
