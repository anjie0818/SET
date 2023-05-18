package com.ceshiren.testcases;

import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.ceshiren.class2"})
@ExcludeClassNamePatterns({"com.ceshiren.class2.*Test$"})
public class RunSuite6Test {
    public RunSuite6Test() {
    }
}