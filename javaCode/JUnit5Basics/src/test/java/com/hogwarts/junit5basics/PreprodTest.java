package com.hogwarts.junit5basics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//自定义一个注解标签，叫做 PreprodTest
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Tag("abcd")
@Test
public @interface PreprodTest {
}