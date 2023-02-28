package com.selenium.testngReport;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyReporterListenerAdapter implements IReporter {

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> tests = suite.getResults();
			for (ISuiteResult r : tests.values()) {
				ITestContext overview = r.getTestContext();
				System.err.println("suite: " + overview.getName());
				System.err.println("Stard Time: "+overview.getStartDate());
				System.err.println("End Time: "+overview.getEndDate());

				System.err.println("all methods num : "+overview.getAllTestMethods().length);
				
				//passed
				System.err.println("passed: " + overview.getPassedTests().size());
				Set<ITestResult> passedSet = overview.getPassedTests().getAllResults();
				for(ITestResult p : passedSet){
					System.err.println("class: " +p.getTestClass().getName() + " | method: "+p.getName());
				}

				//failed
				System.err.println("failed: " + overview.getFailedTests().size());
				Set<ITestResult> failedSet = overview.getFailedTests().getAllResults();
				for(ITestResult f : failedSet){
					System.err.println("class: " +f.getTestClass().getName()+ " | method: "+f.getName() + " | error: "+ f.getThrowable());
				}
				
				//skipped
				System.err.println("skipped: " + overview.getSkippedTests().size());
				Set<ITestResult> skippedSet = overview.getSkippedTests().getAllResults();
				for(ITestResult s : skippedSet){
					System.err.println("---- " +s.getName() );
					System.err.println(s.getThrowable());
				}
				System.err.println("==================================");
			}
			
		}

	}
}