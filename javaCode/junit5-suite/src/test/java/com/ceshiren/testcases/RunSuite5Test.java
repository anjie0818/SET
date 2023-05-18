package com.ceshiren.testcases;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.ceshiren.class2"})
@IncludeClassNamePatterns({"com.ceshiren.class2.*Test"})
public class RunSuite5Test {
    public RunSuite5Test() {
    }
}