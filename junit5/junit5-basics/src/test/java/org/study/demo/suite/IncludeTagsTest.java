package org.study.demo.suite;

import org.junit.platform.suite.api.*;

@SelectPackages({
        "org.study.demo",
})
// SelectPackages报下，IncludePackages的包
@IncludeTags({
        "prd"
})
@Suite
@SuiteDisplayName("执行IncludeTags测试包")
public class IncludeTagsTest {
}
