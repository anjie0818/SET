package org.study.practice.parallel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.DisplayName.class)
public class MethodDisplayNameTest {
    @Test
    @DisplayName("8")
    void orderOne(){
        System.out.println("orderOne");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    @DisplayName("2")
    void orderTwo(){
        System.out.println("OrderTwo");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    @DisplayName("11")
    void orderThree(){
        System.out.println("orderThree");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
