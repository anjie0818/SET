package org.study.practice.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({
    org.study.practice.strs.StrsTest.class,
    org.study.practice.nums.SumTest.class
})
@SuiteDisplayName("加法、字符串拼接")
public class SuiteTest1 {
}
