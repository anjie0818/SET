package org.study.demo.suite;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({
        "org.study.demo.ass",
})
@IncludeClassNamePatterns("org.study.demo.ass.*Test")
@Suite
@SuiteDisplayName("执行多个测试包")
public class IncludeClassNamePatternsTest
{
}
