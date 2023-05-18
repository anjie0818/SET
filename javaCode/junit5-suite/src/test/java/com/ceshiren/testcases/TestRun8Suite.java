package com.ceshiren.testcases;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.ceshiren.class1", "com.ceshiren.class2"})
@ExcludeTags({"SuiteTag"})
public class TestRun8Suite {
    public TestRun8Suite() {
    }
}