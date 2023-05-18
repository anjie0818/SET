package com.hogwarts.junit5basics;

import org.junit.jupiter.api.*;

// 注意 如果对类排序，使用TestClassOrder
//@TestClassOrder(ClassOrderer.OrderAnnotation.class)
//根据类的DisplayName排序
//@TestClassOrder(ClassOrderer.DisplayName.class)
// 随机排序
//@TestClassOrder(ClassOrderer.Random.class)
// 根据类名进行排序
//@TestClassOrder(ClassOrderer.ClassName.class)
public class OrderClassExampleTest {
    @Nested
//    @DisplayName("4")
//    @Order(1)
    class Hogwarts1{
        @Test
        void hogwarts(){
            System.out.println("HogwartsOne");
        }
    }
    @Nested
//    @DisplayName("2")
//    @Order(2)
    class Hogwarts2{
        @Test
        void hogwarts(){
            System.out.println("HogwartsTwo");
        }
    }
    @Nested
//    @Order(3)
//    @DisplayName("3")
    class Hogwarts3{
        @Test
        void hogwarts(){
            System.out.println("HogwartsThree");
        }
    }
}
