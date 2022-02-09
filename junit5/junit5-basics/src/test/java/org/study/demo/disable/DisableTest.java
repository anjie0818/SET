package org.study.demo.disable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
@Disabled("until bug #98 fixed")
public class DisableTest {

    @Disabled("until bug #99 fixed")
    @Test
    void testSkip(){
        System.out.println("----testSkip2----");
    }
    @Test
    void testSkip2(){
        System.out.println("----testSkip2----");
    }

}
