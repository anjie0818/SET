package org.study.demo.param;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpecialParamTest {

    @ParameterizedTest
    @EmptySource
    void testEmptySource(String param){
        assertTrue(param.isEmpty());
    }
    @ParameterizedTest
    @NullAndEmptySource
    void testNullAndEmptySource(String param){
        assertTrue(param == null || param.isEmpty());
    }

    @ParameterizedTest
    // @NullAndEmptySource 注解结合了 @EmptySource 与 @NullSource
    @NullAndEmptySource
    // 如果还有其他参数可以用@ValueSource继续提供
    @ValueSource(strings = {""})
    void testEmptyNullAndValueSource(String param) {
        // 断言参数是空的
        assertTrue(param == null || param.isEmpty());
    }
}
