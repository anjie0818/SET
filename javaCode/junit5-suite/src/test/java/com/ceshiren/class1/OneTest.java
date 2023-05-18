package com.ceshiren.class1;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class OneTest {
    @Test
    @Tags({
            @Tag("SuiteTag"),
            @Tag("SuiteTag1")
    })
    void test1() {
        System.out.println("com.class5.packageA-----OneTest.java");
    }
}
