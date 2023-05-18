package com.ceshiren.class2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class OneTest {
    public OneTest() {
    }

    @Test
    @Tags({@Tag("SuiteTag"), @Tag("SuiteTag1")})
    void test1() {
        System.out.println("com.class5.packageB-----OneTest");
    }
}