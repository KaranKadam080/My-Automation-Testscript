package com.crm.listernerscode;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;                                                                   333

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TakeScreenshotWithExtentReport implements ITestListener {
  public ExtentReports report;
  public ExtentSparkReporter spark;
  public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test=report.createTest(name);
		test.log(Status.INFO,"Welcome to our class...");
		test.log(Status.INFO, "my wonderfull fellows");
		
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "your testcase has passed");
	}	

	@Override
	public void onTestFailure(ITestResult result) {
	    test.log(Status.FAIL, "your testcase has failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	

	}

}
