package com.hogwarts.junit5extend;

import org.junit.jupiter.api.*;
// BaseBTest 继承与 BaseATest
// 为什么没有变化： 因为子类所有的方法名 都和 父类一样
// 如何解决： 使子类的方法名和父类不一致
// 结果： 在执行子类的过程中， 父类的所有的带@Test @BeforeAll AfterAll BeforeEach AfterEach注解的方法也执行了
// 执行顺序：
// 用例执行顺序： 1/2/5（父类） -> 3/4 （子类）
// All执行顺序 beforeAAll->beforeBAll -> afterBAll -> afterAAll : 1. 父类优先级更高 2. 先开始的后结束 3. 所有用例开始结束前后执行
// EACH 执行顺序 ： 同 All 基本一致 1. 父类优先级更高 2. 先开始的后结束 不一致在于 在每个用例开始结束前后执行
// beforeAEach ->beforeBEach -> test -> afterBEach ->afterAEach->beforeAEach...->test->...
// beforeAAll->beforeBAll ->//
// beforeAEach ->beforeBEach ->
// test1 ->
// afterBEach ->afterAEach->
// beforeAEach...->
// test2
// ->...->
// afterBAll -> afterAAll

public class BaseBTest  extends BaseATest{
    @BeforeAll
    static void beforeBAll(){
        System.out.println("BaseBTest----beforeAAll");
    }
    @AfterAll
    static void afterBAll(){
        System.out.println("BaseBTest----afterAAll");
    }
    @BeforeEach
    void beforeBEach(){
        System.out.println("BaseBTest----beforeAEach");
    }
    @AfterEach
    void afterBEach(){
        System.out.println("BaseBTest----afterAEach");
    }
    @Test
    void hogwarts3(){
        System.out.println("BaseBTest----hogwarts1测试用例");
    }
    @Test
    void hogwarts4(){
        System.out.println("BaseBTest----hogwarts2测试用例");
    }
}
