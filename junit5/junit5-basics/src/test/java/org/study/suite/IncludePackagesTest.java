package org.study.suite;

import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({
        "org.study.demo",
})
// SelectPackages报下，IncludePackages的包
@IncludePackages({
        "org.study.demo.nest"
})
@Suite
@SuiteDisplayName("执行IncludePackages测试包")
public class IncludePackagesTest {
}
