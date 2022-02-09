package org.study.demo.ass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {

    @Test
    void testAssertAll(){
        //分组断言
        assertAll("All",
                ()->assertEquals(1,1),
                ()->assertEquals(2,22),
                ()->assertEquals(3,33),
                ()->assertEquals(4,4)
        );
    }
}
