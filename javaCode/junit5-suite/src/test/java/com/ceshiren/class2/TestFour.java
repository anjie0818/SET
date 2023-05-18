
package com.ceshiren.class2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestFour {
    public TestFour() {
    }

    @Test
    @Tag("SuiteTag1")
    void test1() {
        System.out.println("com.class5.packageB-----TestFour");
    }

    @Test
    void test2() {
        System.out.println("com.class5.packageB-----TestFour---test2");
    }

    @Test
    void test3() {
        System.out.println("com.class5.packageB-----TestFour---test3");
    }

    @Test
    void test4() {
        System.out.println("com.class5.packageB-----TestFour---test4");
    }
}