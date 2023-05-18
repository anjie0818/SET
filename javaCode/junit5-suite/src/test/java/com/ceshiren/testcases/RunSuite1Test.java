package com.ceshiren.testcases;

import com.ceshiren.class1.OneTest;
import com.ceshiren.class2.TwoTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({OneTest.class, TwoTest.class})
public class RunSuite1Test {
    public RunSuite1Test() {
    }
}
