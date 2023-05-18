
package com.ceshiren.testcases;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.ceshiren"})
@ExcludePackages({"com.ceshiren.class2", "com.ceshiren.testcases"})
public class RunSuite4Test {
    public RunSuite4Test() {
    }
}