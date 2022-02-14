package org.study.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({
        "org.study.demo.ass",
        "org.study.demo.nest"
})
@Suite
@SuiteDisplayName("执行多个测试包")
public class SelectPackagesTest {
}
