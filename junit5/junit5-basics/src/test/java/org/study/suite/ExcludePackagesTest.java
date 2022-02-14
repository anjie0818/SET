package org.study.suite;

import org.junit.platform.suite.api.*;

@SelectPackages({
        "org.study.demo",
})
// SelectPackages报下，IncludePackages的包
@ExcludePackages({
        "org.study.demo.nest"
})
@Suite
@SuiteDisplayName("执行IncludePackages测试包")
public class ExcludePackagesTest {
}
