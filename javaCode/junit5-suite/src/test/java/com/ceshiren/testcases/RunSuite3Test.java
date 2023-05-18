
package com.ceshiren.testcases;

import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.ceshiren"})
@IncludePackages({"com.ceshiren.class1", "com.ceshiren.class2"})
public class RunSuite3Test {
    public RunSuite3Test() {
    }
}
