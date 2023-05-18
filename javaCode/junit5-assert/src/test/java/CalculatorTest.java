/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

import com.ceshiren.util.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void test1() throws InterruptedException {
        int add1 = Calculator.add(1, 4);
        //这里断言失败
        assertEquals(9,add1);
        int add2 = Calculator.add(5, 4);
        assertEquals(9,add2);
    }

    @Test
    void test2() throws InterruptedException {
        int add1 = Calculator.add(1, 4);
        //这里断言失败
        int add2 = Calculator.add(5, 4);
        //直接在assertAll里面使用lamba 表达式
        assertAll(
                ()->{
                    System.out.println("这个第一个断言：");
                    assertEquals(9,add2);
                    },
                ()->assertEquals(9,add1)
        );
    }


    @Test
    void test3() throws InterruptedException {
        ArrayList<Executable> executables = new ArrayList<>();
        int add1 = Calculator.add(1, 4);
        executables.add(()->assertEquals(9,add1));
        //这里断言失败
        int add2 = Calculator.add(5, 4);
        executables.add(()->assertEquals(9,add2));
        //把断言内容放在list内，统一进行断言
        assertAll(
                "执行流错误信息",executables.stream()
        );
    }

}
