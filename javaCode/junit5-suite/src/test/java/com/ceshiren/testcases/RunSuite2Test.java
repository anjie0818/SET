
package com.ceshiren.testcases;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages({"com.ceshiren.class1", "com.ceshiren.class2"})
@SuiteDisplayName("执行多个测试包的suite套件")
public class RunSuite2Test {
    public RunSuite2Test() {
    }
}