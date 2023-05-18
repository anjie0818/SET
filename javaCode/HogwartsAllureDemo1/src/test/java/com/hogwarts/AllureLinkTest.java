package com.hogwarts;

import io.qameta.allure.Allure;
import io.qameta.allure.Link;
import io.qameta.allure.Links;
import org.junit.jupiter.api.Test;

public class AllureLinkTest {
    @Test
    @Link(name = "静态链接", url = "https://ceshiren.com")
    public void staticLinkTest() {
        assert 1 + 1 == 2;
    }

    @Test
    @Links({@Link(name = "链接1",url="https://www.baidu.com"),
            @Link(name = "链接2",url="https://www.ceshiren.com")
    })
    public void staticLinksTest() {
        assert 1 + 1 == 2;
    }

    @Test
    public void dynamicLinkTest() {
        assert 1 + 1 == 2;
        Allure.link("Dynamic link", "https://ceshiren.com");
    }
}