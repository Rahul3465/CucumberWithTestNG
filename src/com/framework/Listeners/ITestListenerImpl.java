package com.framework.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ITestListenerImpl extends ExtentReportListener implements ITestListener
{
	private static ExtentReports extent;
	
	public void onStart(ITestContext context) {
		System.out.println("Execution started on UAT env...");
		extent= setUp();
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution completed on UAT env...");
		extent.flush();		
		System.out.println("Generated Report. . .");
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult context) {
		System.out.println("FAIL");
		
	}

	public void onTestSkipped(ITestResult context) {
		System.out.println("SKIP");
		
	}

	public void onTestStart(ITestResult context) {
		
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult context) {
		System.out.println("PASS");
	}
	
}
