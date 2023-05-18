package com.hogwarts.junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertNoNullTest {
    @Test
    void nullDemo(){
        System.out.println("断言传值为空的场景");
        assertNotNull(null);
    }
    @Test
    void notNullDemo(){
        System.out.println("断言传值不为空的场景");
        assertNotNull("hogwarts");
    }

}
