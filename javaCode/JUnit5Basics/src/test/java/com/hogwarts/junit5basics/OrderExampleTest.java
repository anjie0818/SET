package com.hogwarts.junit5basics;

import org.junit.jupiter.api.*;

// 指定排序方式为通过Order注解排序，注意： 需要和@Order注解结合使用
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// 通过DisplayName进行排序，需要和@DisplayName 注解结
//@TestMethodOrder(MethodOrderer.DisplayName.class)
// 随机排序
//@TestMethodOrder(MethodOrderer.Random.class)
//通过方法名称进行排序
//@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderExampleTest {
//    @DisplayName("4")
    @Test
//    @Order(1)
    void Hogwarts1(){
        System.out.println("第1条用例");
    }
//    @DisplayName("2")
    @Test
//    @Order(2)
    void Hogwarts2(){
        System.out.println("第2条用例");
    }
//    @DisplayName("3")
    @Test
//    @Order(3)
    void Hogwarts3(){
        System.out.println("第3条用例");
    }
//    @DisplayName("1")
    @Test
//    @Order(4)
    void Hogwarts4(){
        System.out.println("第4条用例");
    }

}
