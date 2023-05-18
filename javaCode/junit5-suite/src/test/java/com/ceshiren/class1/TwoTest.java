package com.ceshiren.class1;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TwoTest {
    @Test
    @Tag("SuiteTag")
    void test1() {
        System.out.println("com.class5.packageA-----TwoTest");
    }
}
