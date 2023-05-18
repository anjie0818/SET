package com.hogwarts.junit5assert;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AssertsTimeoutDemoTest {
    @Test
    void timeoutDemo() throws InterruptedException {
        // 第一个参数传递超时时间， Duration.ofSeconds(3) 代表3秒超时
        // 第二个参数传递操作
        // 第二个参数如果超出第一个参数限定的时间范围，那么就是超时，就会抛出异常
//        sleep(4000);
        assertTimeout(Duration.ofSeconds(3), ()->{
            sleep(1000);
        });

    }
}
