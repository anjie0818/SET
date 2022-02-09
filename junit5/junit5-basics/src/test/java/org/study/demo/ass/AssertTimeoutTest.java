package org.study.demo.ass;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AssertTimeoutTest {

    @Test
    void testAssertTimeout(){
        assertTimeout(Duration.ofSeconds(3),
                ()->{
                    sleep(2000);
                });
    }
}
