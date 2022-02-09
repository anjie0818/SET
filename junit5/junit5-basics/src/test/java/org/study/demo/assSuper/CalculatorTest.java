package org.study.demo.assSuper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.study.demo.Calculator;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    /**
     * 一个断言失败会跳出方法
     */
    @Test
    void test1() throws InterruptedException {
        int actual = Calculator.add(1, 2);
        assertEquals(2,actual);
        int actual2 = Calculator.add(1, 2);
        assertEquals(1,actual2);
    }
    /**
     * 使用assertAll
     */
    @Test
    void test2() throws InterruptedException {
        int actual = Calculator.add(1, 2);
        int actual2 = Calculator.add(1, 2);
        assertAll(
                ()->{
                   assertEquals(1,actual);
                },
                ()->{
                    assertEquals(1,actual2);
                }
        );
    }
    /**
     * 使用list
     */
    @Test
    void test3() throws InterruptedException {
        ArrayList<Executable> executables = new ArrayList<>();
        int actual = Calculator.add(1, 2);
        executables.add(() -> assertEquals(1, actual));
        int actual2 = Calculator.add(1, 2);
        executables.add(() -> assertEquals(1, actual2));
        assertAll(executables.stream());
    }

}
