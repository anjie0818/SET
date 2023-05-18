package com.ceshiren.testcases;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.ceshiren.class1", "com.ceshiren.class2"})
@IncludeTags({"SuiteTag"})
public class RunSuite7Test {
    public RunSuite7Test() {
    }
}